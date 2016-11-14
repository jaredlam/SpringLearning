package com.jaredluo.test.cglibdynamicproxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.cglibdynamicproxy.PlayerImpl;
import com.jaredluo.springlearning.cglibdynamicproxy.PlayerProxyFactory;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestCglibDynamicProxy {

	@Test
	public void test() {
		PlayerImpl playerImpl = new PlayerImpl();

		PlayerProxyFactory playerProxyFactory = new PlayerProxyFactory();
		PlayerImpl player = (PlayerImpl) playerProxyFactory.create(playerImpl);
		player.play();
	}
}
