package com.jaredluo.springlearning.javabased;

public class StringStore implements Store<String> {

	public void destroy() {
		System.out.println("Destroy");
	}

	public void init() {
		System.out.println("Init");
	}
}
