package com.jaredluo.test.aop.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.aop.aspectj.PersonService;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestApectJ extends UnitTestBase {

	public TestApectJ() {
		super("classpath:spring-aop-aspectj.xml");
	}

	@Test
	public void test() {
		PersonService service = getBean("personService");
		service.save();
	}

}
