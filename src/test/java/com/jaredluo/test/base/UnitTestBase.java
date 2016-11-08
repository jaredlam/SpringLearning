package com.jaredluo.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

	private String springXmlPath;
	private ClassPathXmlApplicationContext context;

	public UnitTestBase(String springXmlPath) {
		this.springXmlPath = springXmlPath;
	}

	@Before
	public void before() {
		if (StringUtils.isEmpty(springXmlPath)) {
			springXmlPath = "classpath*:spring-*.xml";
		}

		context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
		context.start();
	}

	@After
	public void after() {
		context.destroy();
	}

	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		return (T) context.getBean(beanId);
	}

	protected <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
}
