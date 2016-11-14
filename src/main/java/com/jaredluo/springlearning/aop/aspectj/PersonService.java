package com.jaredluo.springlearning.aop.aspectj;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Person("annotation person")
	public String save(String saveWord) {
		String result = "save successfully:" + saveWord;
		System.out.println(result);
		return result;
	}
}
