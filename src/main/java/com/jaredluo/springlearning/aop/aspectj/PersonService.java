package com.jaredluo.springlearning.aop.aspectj;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	public String save() {
		String result = "save successfully";
		System.out.println(result);
		return result;
	}
}
