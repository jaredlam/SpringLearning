package com.jaredluo.springlearning.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class BeanResource implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void resource() throws IOException {
		Resource resource = applicationContext.getResource("url:http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}
}
