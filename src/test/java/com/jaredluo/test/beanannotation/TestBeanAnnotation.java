package com.jaredluo.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.beanannotation.BeanAnnotation;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

	public TestBeanAnnotation() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void beanAnnotation() {
		BeanAnnotation beanAnnotation = getBean("beanAnnotation");
		beanAnnotation.say("This is a test");
		System.out.println("beanAnnotation hash code:" + beanAnnotation.hashCode());

		BeanAnnotation beanAnnotation1 = getBean("beanAnnotation");
		beanAnnotation1.say("This is a test");
		System.out.println("beanAnnotation1 hash code:" + beanAnnotation1.hashCode());

	}

}
