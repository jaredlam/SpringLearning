package com.jaredluo.springlearning.aop.schema;

public class SchemaBiz {
	public void biz() {
		System.out.println("Do biz!");
		// throw new RuntimeException();
	}

	public void biz1() {
		System.out.println("Do Biz 1");
	}

	public void biz2(String name, Integer times) {
		System.out.println("biz2 the name is " + name + ", the times is " + times);
	}
}
