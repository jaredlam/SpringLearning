package com.jaredluo.springlearning.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LearningAware implements ApplicationContextAware, BeanNameAware {

	private String beanName;

	@Override
	public void setBeanName(String name) {
		System.out.println("LearningAware:setBeanName:" + name);
		this.beanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		LearningAware learningAware = (LearningAware) context.getBean(this.beanName);
		System.out.println("LearningAware:setApplicationContext:" + learningAware.toString());
	}

}
