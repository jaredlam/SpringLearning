package com.jaredluo.springlearning.beanannotation;

import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class BeanAnnotation {
	public void say(String word){
		System.out.println("BeanAnnotation:" + word);
	}
}
