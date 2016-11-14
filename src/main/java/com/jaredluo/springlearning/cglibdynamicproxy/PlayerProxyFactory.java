package com.jaredluo.springlearning.cglibdynamicproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class PlayerProxyFactory implements MethodInterceptor {

	private Object target;

	public Object create(Object target) {
		this.target = target;
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("开始");
		Object result = method.invoke(target, args);
		System.out.println("结束");
		return result;
	}

}
