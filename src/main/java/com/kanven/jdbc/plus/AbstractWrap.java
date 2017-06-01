package com.kanven.jdbc.plus;

import java.sql.SQLException;
import java.sql.Wrapper;

public class AbstractWrap implements Wrapper {

	@SuppressWarnings("unchecked")
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if (isWrapperFor(iface)) {
			return (T) this;
		}
		throw new SQLException(String.format(
				"[%s] cannot be unwrapped as [%s]", getClass().getName(),
				iface.getName()));
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return iface.isInstance(this);
	}

}
