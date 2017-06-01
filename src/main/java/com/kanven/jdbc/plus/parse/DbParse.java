package com.kanven.jdbc.plus.parse;

import com.alibaba.druid.sql.parser.SQLStatementParser;

public interface DbParse {

	SQLStatementParser parse(String sql);
	
}
