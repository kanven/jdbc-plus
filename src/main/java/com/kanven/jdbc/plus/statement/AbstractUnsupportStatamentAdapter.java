package com.kanven.jdbc.plus.statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kanven.jdbc.plus.AbstractWrap;

public abstract class AbstractUnsupportStatamentAdapter extends AbstractWrap
		implements Statement {

	public void addBatch(String sql) throws SQLException {
		throw new UnsupportedOperationException(
				"sql batch op is not supported.");
	}

	public int[] executeBatch() throws SQLException {
		throw new UnsupportedOperationException(
				"sql batch op is not supported.");
	}

	public void clearBatch() throws SQLException {
		throw new UnsupportedOperationException(
				"sql batch op is not supported.");
	}

	public ResultSet getGeneratedKeys() throws SQLException {
		throw new UnsupportedOperationException(
				"generated keys op is not supported");
	}

	public void closeOnCompletion() throws SQLException {
		throw new UnsupportedOperationException(
				"close on completion op is not supported");
	}

	public boolean isCloseOnCompletion() throws SQLException {
		throw new UnsupportedOperationException(
				"close on completion op is not supported");
	}

}
