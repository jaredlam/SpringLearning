package com.jaredluo.springlearning.aop.schema;

public class AccessCountImpl implements AccessCount {

	private int counter;

	@Override
	public void count() {
		counter++;
		System.out.println("count is trigger, now counter is " + getCounter());
	}

	public int getCounter() {
		return counter;
	}
}
