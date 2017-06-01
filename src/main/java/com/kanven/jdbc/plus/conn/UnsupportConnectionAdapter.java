package com.kanven.jdbc.plus.conn;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import com.kanven.jdbc.plus.AbstractWrap;

public abstract class UnsupportConnectionAdapter extends AbstractWrap {

	public void setCatalog(String catalog) throws SQLException {
		throw new UnsupportedOperationException("catalog is not supported.");
	}

	public String getCatalog() throws SQLException {
		throw new UnsupportedOperationException("catalog is not supported.");
	}

	public Map<String, Class<?>> getTypeMap() throws SQLException {
		throw new UnsupportedOperationException("type map is not supported.");
	}

	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		throw new UnsupportedOperationException("type map is not supported.");
	}

	public Clob createClob() throws SQLException {
		throw new UnsupportedOperationException("clob is not supported.");
	}

	public Blob createBlob() throws SQLException {
		throw new UnsupportedOperationException("clob is not supported.");
	}

	public NClob createNClob() throws SQLException {
		throw new UnsupportedOperationException("nclob is not supported.");
	}

	public SQLXML createSQLXML() throws SQLException {
		throw new UnsupportedOperationException("nclob is not supported.");
	}

	public boolean isValid(int timeout) throws SQLException {
		throw new UnsupportedOperationException("valid is not supported.");
	}

	public void setClientInfo(String name, String value)
			throws SQLClientInfoException {
		throw new UnsupportedOperationException("client info is not supported.");
	}

	public void setClientInfo(Properties properties)
			throws SQLClientInfoException {
		throw new UnsupportedOperationException("client info is not supported.");
	}

	public String getClientInfo(String name) throws SQLException {
		throw new UnsupportedOperationException("client info is not supported.");
	}

	public Properties getClientInfo() throws SQLException {
		throw new UnsupportedOperationException("client info is not supported.");
	}

	public Array createArrayOf(String typeName, Object[] elements)
			throws SQLException {
		throw new UnsupportedOperationException("arrayof is not supported.");
	}

	public Struct createStruct(String typeName, Object[] attributes)
			throws SQLException {
		throw new UnsupportedOperationException("struct is not supported.");
	}

	public void setSchema(String schema) throws SQLException {
		throw new UnsupportedOperationException("schema is not supported.");
	}

	public String getSchema() throws SQLException {
		throw new UnsupportedOperationException("schema is not supported.");
	}

	public void setNetworkTimeout(Executor executor, int milliseconds)
			throws SQLException {
		throw new UnsupportedOperationException(
				"network timeout is not supported.");
	}

	public int getNetworkTimeout() throws SQLException {
		throw new UnsupportedOperationException(
				"network timeout is not supported.");
	}

	public CallableStatement prepareCall(String sql) throws SQLException {
		throw new UnsupportedOperationException(
				"prepare call is not supported.");
	}

	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		throw new UnsupportedOperationException(
				"prepare call is not supported.");
	}

	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		throw new UnsupportedOperationException(
				"prepare call is not supported.");
	}

}
