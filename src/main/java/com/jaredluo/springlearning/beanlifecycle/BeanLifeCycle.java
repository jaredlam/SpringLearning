package com.jaredluo.springlearning.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {

	public void start() {
		System.out.println("Start");
	}

	public void end() {
		System.out.println("End");
	}

	public void doSomething() {
		System.out.println("Did something");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet");
	}

	public void defaultStart() {
		System.out.println("defaultStart");
	}

	public void defaultDestory() {
		System.out.println("defaultDestory");
	}
}
