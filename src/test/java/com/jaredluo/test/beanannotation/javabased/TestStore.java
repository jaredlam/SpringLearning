package com.jaredluo.test.beanannotation.javabased;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.javabased.MyDriverMananger;
import com.jaredluo.springlearning.javabased.Store;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestStore extends UnitTestBase {

	public TestStore() {
		super("classpath:spring-beanannotation-javabased.xml");
	}

	@Test
	public void say() {
		Store<String> store = getBean("stringStore");
		System.out.println(store.hashCode());

		Store<String> store1 = getBean("stringStore");
		System.out.println(store1.hashCode());
	}

	@Test
	public void driverManager() {
		MyDriverMananger myDriverMananger = getBean("myDriverManager");
		System.out.println(myDriverMananger.getClass().getName());
	}

	@Test
	public void testGStore() {
		super.getBean("testGStore");
	}
}
