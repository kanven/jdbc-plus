package com.kanven.jdbc.plus.conn;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.List;

import com.kanven.jdbc.plus.source.DataSourceContainer;
import com.kanven.jdbc.plus.statement.RWSplitPreparedStatementAdapter;
import com.kanven.jdbc.plus.statement.RWSplitStatement;

public class RWSplitConnection extends AbstractConnectionAdapter {

	private ConnectionContext context;

	public RWSplitConnection(DataSourceContainer container) throws SQLException {
		context = new ConnectionContext(container, this);
	}

	public String nativeSQL(String sql) throws SQLException {
		return context.master().nativeSQL(sql);
	}

	public DatabaseMetaData getMetaData() throws SQLException {
		return context.master().getMetaData();
	}

	public Savepoint setSavepoint() throws SQLException {
		return context.master().setSavepoint();
	}

	public Savepoint setSavepoint(String name) throws SQLException {
		return context.master().setSavepoint(name);
	}

	public void rollback(Savepoint savepoint) throws SQLException {
		context.master().rollback(savepoint);
	}

	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		context.master().releaseSavepoint(savepoint);
	}

	public Statement createStatement() throws SQLException {
		return new RWSplitStatement(context);
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return new RWSplitPreparedStatementAdapter(context, sql);
	}

	public Statement createStatement(int resultSetType, int resultSetConcurrency)
			throws SQLException {
		return new RWSplitStatement(context, resultSetType,
				resultSetConcurrency);
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		return new RWSplitPreparedStatementAdapter(context, sql, resultSetType,
				resultSetConcurrency);
	}

	public Statement createStatement(int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		return new RWSplitStatement(context, resultSetType,
				resultSetConcurrency, resultSetHoldability);
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		return new RWSplitPreparedStatementAdapter(context, sql, resultSetType,
				resultSetConcurrency, resultSetHoldability);
	}

	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
			throws SQLException {
		return new RWSplitPreparedStatementAdapter(context, sql,
				autoGeneratedKeys);
	}

	public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
			throws SQLException {
		return new RWSplitPreparedStatementAdapter(context, sql, columnIndexes);
	}

	public PreparedStatement prepareStatement(String sql, String[] columnNames)
			throws SQLException {
		return new RWSplitPreparedStatementAdapter(context, sql, columnNames);
	}

	List<Connection> getConnections() {
		return context.getConnections();
	}

}
