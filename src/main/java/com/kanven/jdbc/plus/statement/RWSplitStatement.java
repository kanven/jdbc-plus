package com.kanven.jdbc.plus.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;

import com.kanven.jdbc.plus.conn.ConnectionContext;

public class RWSplitStatement extends AbstractStatementAdapter<Statement> {

	private ConnectionContext context;

	public RWSplitStatement(ConnectionContext context) {
		this.context = context;
	}

	public RWSplitStatement(ConnectionContext context, int resultSetType,
			int resultSetConcurrency) {
		super(resultSetType, resultSetConcurrency);
		this.context = context;
	}

	public RWSplitStatement(ConnectionContext context, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability) {
		super(resultSetType, resultSetConcurrency, resultSetHoldability);
		this.context = context;
	}

	public Connection getConnection() throws SQLException {
		return context.getConnection();
	}

	// 有待优化
	private BackendStatementWrapper<Statement> getStatement(Connection conn)
			throws SQLException {
		BackendStatementWrapper<Statement> backend = null;
		for (BackendStatementWrapper<Statement> wrapper : getWrappers()) {
			if (wrapper.isBelong(conn)) {
				backend = wrapper;
				break;
			}
		}
		if (backend == null) {
			Statement statement = conn.createStatement();
			statement.setQueryTimeout(getQueryTimeout());
			statement.setPoolable(isPoolable());
			statement.setMaxRows(getMaxRows());
			if (getFetchSize() > 0) {
				statement.setFetchSize(getFetchSize());
			}
			if (getFetchSize() > 0) {
				statement.setMaxFieldSize(getMaxFieldSize());
			}
			if (!StringUtils.isBlank(cursorName)) {
				statement.setCursorName(cursorName);
			}
			statement.setEscapeProcessing(escapeProcessing);
			backend = new BackendStatementWrapper<Statement>(statement);
			addWrapper(backend);
		}
		return backend;
	}

	@Override
	protected BackendStatementWrapper<Statement> getStatement(String sql)
			throws SQLException {
		Connection conn = context.getConnection(sql);
		return getStatement(conn);
	}

	@Override
	protected BackendStatementWrapper<Statement> getMasterStatement() throws SQLException {
		return getStatement(context.master());
	}

}
