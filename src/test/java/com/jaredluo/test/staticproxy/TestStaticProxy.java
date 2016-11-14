package com.jaredluo.test.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.staticproxy.Driver;
import com.jaredluo.springlearning.staticproxy.DriverImpl;
import com.jaredluo.springlearning.staticproxy.DriverProxy;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestStaticProxy {

	@Test
	public void testProxy() {
		DriverImpl driverImpl = new DriverImpl();

		Driver driver = new DriverProxy(driverImpl);
		driver.drive();

		// Driver driver2 = (Driver)
		// Proxy.newProxyInstance(driverImpl.getClass().getClassLoader(),
		// driverImpl.getClass().getInterfaces(), new InvocationHandler() {
		//
		// @Override
		// public Object invoke(Object proxy, Method method, Object[] args)
		// throws Throwable {
		// System.out.println("开始");
		// Object result = method.invoke(driverImpl, args);
		// System.out.println("结束");
		// return result;
		// }
		// });
		// driver2.drive();
	}
}
