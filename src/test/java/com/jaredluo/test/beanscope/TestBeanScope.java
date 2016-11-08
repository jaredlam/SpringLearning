package com.jaredluo.test.beanscope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.beanscope.BeanScope;
import com.jaredluo.test.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

	public TestBeanScope() {
		super("classpath:spring-beanscope.xml");
	}

	@Test
	public void say() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope1 = super.getBean("beanScope");
		beanScope1.say();
		
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}
}
