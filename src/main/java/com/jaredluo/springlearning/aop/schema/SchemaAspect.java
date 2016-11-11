package com.jaredluo.springlearning.aop.schema;

import org.aspectj.lang.ProceedingJoinPoint;

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

	public void after() {
		System.out.println("after");
	}

	public void around(ProceedingJoinPoint joinPoint) {
		System.out.println("Around before biz1");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around after biz1");
	}

	public void aroundWithArgs(ProceedingJoinPoint joinPoint, String name, Integer times) {
		System.out.println("Around before biz2, name is " + name + ", times is " + times);
		times += 1;
		Object[] objects = new Object[2];
		objects[0] = name;
		objects[1] = times;
		try {
			joinPoint.proceed(objects);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Around after biz2, name is " + name + ", times is " + times);
	}
}
