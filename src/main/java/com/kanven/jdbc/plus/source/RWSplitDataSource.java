package com.kanven.jdbc.plus.source;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.kanven.jdbc.plus.conn.RWSplitConnection;

/**
 * 读写分离数据源
 * 
 * @author kanven
 * 
 */
public class RWSplitDataSource extends AbstractDataSourceAdapter {

	private DataSourceContainer container;

	public RWSplitDataSource() {
		container = new DataSourceContainer();
	}

	public RWSplitDataSource(DataSource master, List<DataSource> slaves) throws SQLException {
		this.container = new DataSourceContainer(master, slaves);
	}

	public Connection getConnection() throws SQLException {
		return new RWSplitConnection(container);
	}

	public void setMaster(DataSource master) {
		this.container.setMaster(master);
	}

	public void setSlaves(List<DataSource> slaves) {
		this.container.setSlaves(slaves);
	}

}
