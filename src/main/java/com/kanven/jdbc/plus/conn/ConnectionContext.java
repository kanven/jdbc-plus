package com.kanven.jdbc.plus.conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.kanven.jdbc.plus.conn.ConnectionStatusHolder.ConnectionStatus;
import com.kanven.jdbc.plus.conn.strategy.RandomStrategy;
import com.kanven.jdbc.plus.conn.strategy.Strategy;
import com.kanven.jdbc.plus.parse.DbType;
import com.kanven.jdbc.plus.parse.SqlParser;
import com.kanven.jdbc.plus.parse.StatementType;
import com.kanven.jdbc.plus.source.DataSourceContainer;

public final class ConnectionContext {

	private final Connection master;

	private final List<Connection> slaves;

	private final RWSplitConnection connection;

	private ImmutableList<Connection> connections;

	private Strategy strategy;

	public ConnectionContext(DataSourceContainer container,
			RWSplitConnection connection) throws SQLException {
		this.connection = connection;
		master = container.master();
		slaves = container.slaves();
		strategy = new RandomStrategy(slaves.size());
		Builder<Connection> builder = ImmutableList.builder();
		builder.addAll(slaves);
		builder.add(master);
		connections = builder.build();
	}

	public Connection master() {
		return master;
	}

	public Connection slave() {
		return slaves.get(strategy.next());
	}

	public RWSplitConnection getConnection() {
		return connection;
	}

	List<Connection> getConnections() {
		return connections;
	}

	public Connection getConnection(String sql) throws SQLException {
		StatementType type = SqlParser.getDMLType(sql, DbType.MYSQL);
		ConnectionStatus status = ConnectionStatusHolder.get();
		if (type == StatementType.SELECT && status == ConnectionStatus.READ
				&& this.connection.getAutoCommit()) {
			return slaves.get(strategy.next());
		}
		if (status != ConnectionStatus.RW) {
			ConnectionStatusHolder.set(ConnectionStatus.RW);
		}
		return master;
	}

}
