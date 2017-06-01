package com.kanven.jdbc.plus.util;

import java.sql.SQLException;

public interface ThrowExceptionMethodInvoker<T> {

	void invoke(T o) throws SQLException;
	
}
