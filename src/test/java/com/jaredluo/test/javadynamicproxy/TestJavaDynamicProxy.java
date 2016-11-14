package com.jaredluo.test.javadynamicproxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.javadynamicproxy.Bird;
import com.jaredluo.springlearning.javadynamicproxy.BirdImlp;
import com.jaredluo.springlearning.javadynamicproxy.BirdProxyFactory;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaDynamicProxy {

	@Test
	public void test() {
		BirdProxyFactory birdProxyFactory = new BirdProxyFactory();
		BirdImlp birdImlp = new BirdImlp();
		Bird bird = (Bird) birdProxyFactory.create(birdImlp);
		bird.fly();
	}
}
