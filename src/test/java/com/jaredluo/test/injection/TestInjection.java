package com.jaredluo.test.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.injection.service.InjectionService;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

	public TestInjection() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void testAutowire() {
		InjectionService service = getBean("injectionService");
		service.save("这是被保存的数据");
	}

}
