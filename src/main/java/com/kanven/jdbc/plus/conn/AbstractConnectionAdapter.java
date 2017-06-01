package com.kanven.jdbc.plus.conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.List;
import java.util.concurrent.Executor;

import com.kanven.jdbc.plus.util.MethodSafeInvoker;
import com.kanven.jdbc.plus.util.ThrowExceptionMethodInvoker;

/**
 * 读写分离数据库连接
 * 
 * @author kanven
 * 
 */
public abstract class AbstractConnectionAdapter extends
		UnsupportConnectionAdapter implements Connection {

	protected int transactionIsolation = TRANSACTION_READ_UNCOMMITTED;

	protected boolean autoCommit = true;

	private boolean closed;

	private boolean readOnly;

	public boolean getAutoCommit() throws SQLException {
		return this.autoCommit;
	}

	public void setAutoCommit(boolean autoCommit) throws SQLException {
		this.autoCommit = autoCommit;
		for (Connection conn : getConnections()) {
			conn.setAutoCommit(autoCommit);
		}
	}

	public void commit() throws SQLException {
		MethodSafeInvoker.invoke(getConnections(),
				new ThrowExceptionMethodInvoker<Connection>() {
					public void invoke(Connection conn) throws SQLException {
						conn.commit();
					}
				});
	}

	public void rollback() throws SQLException {
		MethodSafeInvoker.invoke(getConnections(),
				new ThrowExceptionMethodInvoker<Connection>() {
					public void invoke(Connection conn) throws SQLException {
						conn.rollback();
					}
				});
	}

	public int getTransactionIsolation() throws SQLException {
		return this.transactionIsolation;
	}

	public final void setTransactionIsolation(int level) throws SQLException {
		this.transactionIsolation = level;
		for (Connection conn : getConnections()) {
			conn.setTransactionIsolation(level);
		}
	}

	public void close() throws SQLException {
		MethodSafeInvoker.invoke(getConnections(),
				new ThrowExceptionMethodInvoker<Connection>() {
					public void invoke(Connection conn) throws SQLException {
						if (!conn.isClosed()) {
							conn.close();
						}
					}
				});
		closed = true;
	}

	public boolean isClosed() throws SQLException {
		return closed;
	}

	public void setReadOnly(boolean readOnly) throws SQLException {
		this.readOnly = readOnly;
		List<Connection> conns = getConnections();
		for (Connection conn : conns) {
			conn.setReadOnly(readOnly);
		}
	}

	public boolean isReadOnly() throws SQLException {
		return readOnly;
	}

	public void abort(Executor executor) throws SQLException {
		for (Connection conn : getConnections()) {
			conn.abort(executor);
		}
	}

	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	public void clearWarnings() throws SQLException {
	}

	public void setHoldability(int holdability) throws SQLException {
	}

	public int getHoldability() throws SQLException {
		return ResultSet.CLOSE_CURSORS_AT_COMMIT;
	}

	abstract List<Connection> getConnections();

}
