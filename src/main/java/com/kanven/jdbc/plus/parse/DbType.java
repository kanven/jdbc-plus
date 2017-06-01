package com.kanven.jdbc.plus.parse;

import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.oracle.parser.OracleStatementParser;
import com.alibaba.druid.sql.parser.SQLStatementParser;

public enum DbType implements DbParse {
	MYSQL {
		public SQLStatementParser parse(String sql) {
			return new MySqlStatementParser(sql);
		}
	},
	ORACLE {
		public SQLStatementParser parse(String sql) {
			return new OracleStatementParser(sql);
		}
	};
}
