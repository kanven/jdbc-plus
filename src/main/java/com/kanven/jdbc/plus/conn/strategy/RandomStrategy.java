package com.kanven.jdbc.plus.conn.strategy;

import java.util.concurrent.atomic.AtomicInteger;

public class RandomStrategy implements Strategy {

	private int size;

	private AtomicInteger inc = new AtomicInteger(0);

	public RandomStrategy(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("size必须大于零");
		}
		this.size = size;
	}

	public int next() {
		if (size == 1) {
			return 0;
		}
		int cursor = inc.get();
		while (true) {
			if (inc.compareAndSet(cursor, cursor + 1)) {
				break;
			}
			cursor = inc.get();
		}
		int index = cursor & Integer.MAX_VALUE % size;
		return index;
	}

}
