package com.jaredluo.springlearning.beanscope;

public class BeanScope {
	public void say() {
		System.out.println("Bean say:" + this.hashCode());
	}
}
