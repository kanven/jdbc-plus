package com.kanven.jdbc.plus.source;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class DataSourceContainer {

	/**
	 * 主库
	 */
	private DataSource master;

	/**
	 * 从库
	 */
	private List<DataSource> slaves;

	public DataSourceContainer() {

	}

	public DataSourceContainer(DataSource master, DataSource... slaves)
			throws SQLException {
		this(master, Arrays.asList(slaves));
	}

	public DataSourceContainer(DataSource master, List<DataSource> slaves)
			throws SQLException {
		this.master = master;
		this.slaves = slaves;
	}

	public Connection master() throws SQLException {
		return master.getConnection();
	}

	public ImmutableList<Connection> slaves() throws SQLException {
		Builder<Connection> builder = ImmutableList.builder();
		int size = slaves.size();
		Connection[] connections = new Connection[size];
		for (int i = 0; i < size; i++) {
			connections[i] = slaves.get(i).getConnection();
		}
		builder.add(connections);
		return builder.build();
	}

	public void setMaster(DataSource master) {
		this.master = master;
	}

	public void setSlaves(List<DataSource> slaves) {
		this.slaves = slaves;
	}

}
