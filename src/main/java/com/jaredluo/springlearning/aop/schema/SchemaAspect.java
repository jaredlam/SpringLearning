package com.jaredluo.springlearning.aop.schema;

public class SchemaAspect {

	public void before() {
		System.out.println("Before");
	}

	public void afterReturning() {
		System.out.println("after returning");
	}

	public void afterThrowing() {
		System.out.println("after throwing");
	}
	
	public void after(){
		System.out.println("after");
	}
}
