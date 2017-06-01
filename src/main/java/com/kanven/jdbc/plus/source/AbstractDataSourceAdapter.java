package com.kanven.jdbc.plus.source;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.kanven.jdbc.plus.AbstractWrap;

public abstract class AbstractDataSourceAdapter extends AbstractWrap implements
		DataSource {

	private PrintWriter writer = new PrintWriter(System.out);

	public PrintWriter getLogWriter() throws SQLException {
		return writer;
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		this.writer = out;
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		throw new UnsupportedOperationException(
				"Longin timeout is not supported.");
	}

	public int getLoginTimeout() throws SQLException {
		throw new UnsupportedOperationException(
				"Longin timeout is not supported.");
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	}

	public Connection getConnection(String username, String password)
			throws SQLException {
		return getConnection();
	}

}
