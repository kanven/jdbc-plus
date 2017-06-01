package com.kanven.jdbc.plus.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.common.base.Objects;

/**
 * Statement复用
 * 
 * @author kanven
 * 
 */
public final class BackendStatementWrapper<T extends Statement> {

	private final T statement;

	private final Connection connection;

	public BackendStatementWrapper(T statement) throws SQLException {
		this.statement = statement;
		this.connection = statement.getConnection();
	}

	public final boolean isBelong(Connection connection) {
		return Objects.equal(this.connection, connection);
	}

	public final T getStatement() {
		return statement;
	}

}
