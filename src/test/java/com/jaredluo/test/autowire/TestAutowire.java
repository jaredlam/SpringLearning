package com.jaredluo.test.autowire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.autowire.AutowireService;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowire extends UnitTestBase {

	public TestAutowire() {
		super("classpath:spring-autowire.xml");
	}

	@Test
	public void testAutowire() {
		AutowireService autowireService = getBean("autowireService");
		autowireService.say("this is a autowire test");
	}
}
