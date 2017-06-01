package com.kanven.jdbc.plus.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Params {

	private Class<?> target;

	private ArrayList<MethodInvocation> invocations = new ArrayList<Params.MethodInvocation>();

	public Params(Class<?> target) {
		this.target = target;
	}

	public void recordParam(int index, String method, Class<?>[] types,
			Object... args) throws NoSuchMethodException, SecurityException {
		invocations.ensureCapacity(index);
		int size = invocations.size();
		while (size <= index - 1) {
			invocations.add(null);
		}
		invocations.set(index,
				new MethodInvocation(target.getMethod(method, types), args));
	}

	public void replay(Object target) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		for (MethodInvocation invocation : invocations) {
			invocation.invoke(target);
		}
	}

	public void clear() {
		invocations.clear();
	}

	private final static class MethodInvocation {

		private Method method;

		private Object[] args;

		public MethodInvocation(Method method, Object[] args) {
			this.method = method;
			this.args = args;
		}

		public void invoke(final Object target) throws IllegalAccessException,
				IllegalArgumentException, InvocationTargetException {
			method.invoke(target, args);
		}

	}

}
