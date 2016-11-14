package com.jaredluo.springlearning.aop.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonAspect {

	@Pointcut("execution(* com.jaredluo.springlearning.aop.aspectj.*.*(..))")
	public void pointcut() {

	}

	@Before("pointcut()")
	public void before() {
		System.out.println("AspectJ before");
	}

	@Before("pointcut() && args(arg)")
	public void beforeWithParam(String arg) {
		System.out.println("AspectJ before with param: " + arg);
	}

	@Before("pointcut() && @annotation(per)")
	public void beforeWithAnnotation(Person per) {
		System.out.println("AspectJ before with annotation: " + per.value());
	}

	@AfterReturning(pointcut = "pointcut()", returning = "returnVal")
	public void afterReturning(Object returnVal) {
		System.out.println("AspectJ after returning: " + returnVal);
	}

	@AfterThrowing(pointcut = "pointcut()", throwing = "e")
	public void afterThrowing(Exception e) {
		System.out.println("AspectJ after throwing: " + e.getMessage());
	}

	@After("pointcut()")
	public void after() {
		System.out.println("AspectJ after");
	}
}
