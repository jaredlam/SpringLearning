package com.jaredluo.test.beanannotation.multibean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.multibean.MultiBeanInvoker;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultiBean extends UnitTestBase{

	public TestMultiBean() {
		super("classpath:spring-beanannotation-multibean.xml");
	}

	@Test
	public void say(){
		MultiBeanInvoker invoker = getBean("multiBeanInvoker");
		invoker.say();
	}
}
