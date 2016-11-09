package com.jaredluo.test.beanresource;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.resource.BeanResource;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanResource extends UnitTestBase{

	public TestBeanResource() {
		super("classpath:spring-beanresource.xml");
	}

	@Test
	public void resource() {
		BeanResource beanResource = getBean("beanResource");
		try {
			beanResource.resource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
