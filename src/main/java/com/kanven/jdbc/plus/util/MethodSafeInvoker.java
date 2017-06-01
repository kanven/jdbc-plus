package com.kanven.jdbc.plus.util;

import java.sql.SQLException;
import java.util.Collection;

public class MethodSafeInvoker {

	public static <T> void invoke(Collection<T> objs,
			ThrowExceptionMethodInvoker<T> invoker) throws SQLException {
		SQLException e = null;
		for (T o : objs) {
			try {
				invoker.invoke(o);
			} catch (SQLException ex) {
				if (e == null) {
					e = ex;
				} else {
					ex.setNextException(e);
					e = ex;
				}
			}
		}
		if (e != null) {
			throw e;
		}
	}
}
