package com.kanven.jdbc.plus.statement;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

import com.kanven.jdbc.plus.util.Params;

public abstract class AbtractPreparedStatementAdapter extends
		AbstractStatementAdapter<PreparedStatement> implements
		PreparedStatement {

	private Params params = new Params(PreparedStatement.class);

	public AbtractPreparedStatementAdapter() {
		super();
	}

	public AbtractPreparedStatementAdapter(int resultSetType,
			int resultSetConcurrency) {
		super(resultSetType, resultSetConcurrency);
	}

	public AbtractPreparedStatementAdapter(int resultSetType,
			int resultSetConcurrency, int resultSetHoldability) {
		super(resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	public final void setNull(int parameterIndex, int sqlType) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNull", new Class<?>[] {
					Integer.class, Integer.class }, parameterIndex, sqlType);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNull is invoked failed.");
		}
	}

	public final void setBoolean(int parameterIndex, boolean x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setBoolean", new Class<?>[] {
					Integer.class, Boolean.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setBoolean is invoked failed.");
		}
	}

	public final void setByte(int parameterIndex, byte x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setByte", new Class<?>[] {
					Integer.class, Byte.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setByte is invoked failed.");
		}
	}

	public final void setShort(int parameterIndex, short x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setInt(int parameterIndex, int x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setLong(int parameterIndex, long x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setFloat(int parameterIndex, float x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setDouble(int parameterIndex, double x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setBigDecimal(int parameterIndex, BigDecimal x)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setString(int parameterIndex, String x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setBytes(int parameterIndex, byte[] x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setDate(int parameterIndex, Date x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setTime(int parameterIndex, Time x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setTimestamp(int parameterIndex, Timestamp x)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setAsciiStream(int parameterIndex, InputStream x, int length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setUnicodeStream(int parameterIndex, InputStream x, int length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setBinaryStream(int parameterIndex, InputStream x, int length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setObject(int parameterIndex, Object x, int targetSqlType)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setObject(int parameterIndex, Object x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setCharacterStream(int parameterIndex, Reader reader, int length)
			throws SQLException {
		try {
			params.recordParam(
					parameterIndex,
					"setCharacterStream",
					new Class<?>[] { Integer.class, Reader.class, Integer.class },
					parameterIndex, reader, length);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setCharacterStream is invoked failed.");
		}
	}

	public final void setRef(int parameterIndex, Ref x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setBlob(int parameterIndex, Blob x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setClob(int parameterIndex, Clob x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setArray(int parameterIndex, Array x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final ResultSetMetaData getMetaData() throws SQLException {
		return null;
	}

	public final void setDate(int parameterIndex, Date x, Calendar cal)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setTime(int parameterIndex, Time x, Calendar cal)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setNull(int parameterIndex, int sqlType, String typeName)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNull", new Class<?>[] {
					Integer.class, Integer.class, String.class },
					parameterIndex, sqlType, typeName);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNull is invoked failed.");
		}
	}

	public final void setURL(int parameterIndex, URL x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setURL", new Class<?>[] {
					Integer.class, URL.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setURL is invoked failed.");
		}
	}

	public final ParameterMetaData getParameterMetaData() throws SQLException {
		return null;
	}

	public final void setRowId(int parameterIndex, RowId x) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setNString(int parameterIndex, String value)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNString", new Class<?>[] {
					Integer.class, String.class }, parameterIndex, value);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNString is invoked failed.");
		}
	}

	public final void setNCharacterStream(int parameterIndex, Reader value,
			long length) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNCharacterStream",
					new Class<?>[] { Integer.class, Reader.class, Long.class },
					parameterIndex, value, length);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNCharacterStream is invoked failed.");
		}
	}

	public final void setNClob(int parameterIndex, NClob value) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNClob", new Class<?>[] {
					Integer.class, NClob.class }, parameterIndex, value);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNClob is invoked failed.");
		}
	}

	public final void setClob(int parameterIndex, Reader reader, long length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setClob", new Class<?>[] {
					Integer.class, Reader.class, Long.class }, parameterIndex,
					reader, length);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setClob is invoked failed.");
		}
	}

	public final void setBlob(int parameterIndex, InputStream inputStream, long length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setBlob", new Class<?>[] {
					Integer.class, InputStream.class, Long.class },
					parameterIndex, inputStream, length);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setBlob is invoked failed.");
		}
	}

	public final void setNClob(int parameterIndex, Reader reader, long length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNClob", new Class<?>[] {
					Integer.class, Reader.class, Long.class }, parameterIndex,
					reader, length);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNClob is invoked failed.");
		}
	}

	public final void setSQLXML(int parameterIndex, SQLXML xmlObject)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setSQLXML", new Class<?>[] {
					Integer.class, SQLXML.class }, parameterIndex, xmlObject);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setSQLXML is invoked failed.");
		}
	}

	public final void setObject(int parameterIndex, Object x, int targetSqlType,
			int scaleOrLength) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setAsciiStream(int parameterIndex, InputStream x, long length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setBinaryStream(int parameterIndex, InputStream x, long length)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setCharacterStream(int parameterIndex, Reader reader,
			long length) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setCharacterStream",
					new Class<?>[] { Integer.class, Reader.class },
					parameterIndex, reader, length);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setCharacterStream is invoked failed.");
		}
	}

	public final void setAsciiStream(int parameterIndex, InputStream x)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setBinaryStream(int parameterIndex, InputStream x)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setShort", new Class<?>[] {
					Integer.class, Short.class }, parameterIndex, x);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setShort is invoked failed.");
		}
	}

	public final void setCharacterStream(int parameterIndex, Reader reader)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setCharacterStream",
					new Class<?>[] { Integer.class, Reader.class },
					parameterIndex, reader);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setCharacterStream is invoked failed.");
		}
	}

	public final void setNCharacterStream(int parameterIndex, Reader value)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNCharacterStream",
					new Class<?>[] { Integer.class, Reader.class },
					parameterIndex, value);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNCharacterStream is invoked failed.");
		}
	}

	public final void setClob(int parameterIndex, Reader reader) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setClob", new Class<?>[] {
					Integer.class, Reader.class }, parameterIndex, reader);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setClob is invoked failed.");
		}
	}

	public final void setBlob(int parameterIndex, InputStream inputStream)
			throws SQLException {
		try {
			params.recordParam(parameterIndex, "setBlob", new Class<?>[] {
					Integer.class, InputStream.class }, parameterIndex,
					inputStream);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setBlob is invoked failed.");
		}
	}

	public final void setNClob(int parameterIndex, Reader reader) throws SQLException {
		try {
			params.recordParam(parameterIndex, "setNClob", new Class<?>[] {
					Integer.class, Reader.class }, parameterIndex, reader);
		} catch (NoSuchMethodException e) {
			throw new SQLException("setNClob is invoked failed.");
		}
	}

	protected final Params getParams() {
		return this.params;
	}

}
