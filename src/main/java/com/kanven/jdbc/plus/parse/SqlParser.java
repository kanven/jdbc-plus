package com.kanven.jdbc.plus.parse;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLCallStatement;
import com.alibaba.druid.sql.ast.statement.SQLDeleteStatement;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.ast.statement.SQLUpdateStatement;

public class SqlParser {

	public static StatementType getDMLType(String sql, DbType dbType) {
		SQLStatement statement = dbType.parse(sql).parseStatement();
		if (statement instanceof SQLSelectStatement) {
			return StatementType.SELECT;
		}
		if (statement instanceof SQLUpdateStatement) {
			return StatementType.UPDATE;
		}
		if (statement instanceof SQLDeleteStatement) {
			return StatementType.DELETE;
		}
		if (statement instanceof SQLInsertStatement) {
			return StatementType.INSERT;
		}
		if (statement instanceof SQLCallStatement) {
			return StatementType.CALL;
		}
		return StatementType.OTHER;
	}

}
