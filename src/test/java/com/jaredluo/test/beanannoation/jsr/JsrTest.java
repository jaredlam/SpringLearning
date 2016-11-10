package com.jaredluo.test.beanannoation.jsr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.beanannotation.jsr.JsrService;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class JsrTest extends UnitTestBase {

	public JsrTest() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void jsrTest() {
		JsrService jsrService = getBean("jsrService");
		jsrService.save();
	}

	
}
