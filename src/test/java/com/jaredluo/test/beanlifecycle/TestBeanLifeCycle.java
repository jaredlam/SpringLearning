package com.jaredluo.test.beanlifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.beanlifecycle.BeanLifeCycle;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle() {
		super("classpath:spring-beanlifecycle.xml");
	}

	@Test
	public void testLifeCycle() {
		BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
		beanLifeCycle.doSomething();
		BeanLifeCycle beanLifeCycle1 = super.getBean("beanLifeCycle");
		beanLifeCycle1.doSomething();
	}

}
