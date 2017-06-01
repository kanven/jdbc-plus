package com.kanven.jdbc.plus.conn;

public class ConnectionStatusHolder {

	private static ThreadLocal<ConnectionStatus> local = new ThreadLocal<ConnectionStatusHolder.ConnectionStatus>() {

		@Override
		protected ConnectionStatus initialValue() {
			return ConnectionStatus.READ;
		}

	};

	public static ConnectionStatus get() {
		return local.get();
	}

	public static void set(ConnectionStatus status) {
		local.set(status);
	}

	public static void remove() {
		local.remove();
	}

	public static enum ConnectionStatus {
		RW, READ
	}
}
