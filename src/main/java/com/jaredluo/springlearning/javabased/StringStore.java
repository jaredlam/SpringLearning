package com.jaredluo.springlearning.javabased;

public class StringStore implements Store {

	public void destroy() {
		System.out.println("Destroy");
	}
	
	public void init(){
		System.out.println("Init");
	}
}
