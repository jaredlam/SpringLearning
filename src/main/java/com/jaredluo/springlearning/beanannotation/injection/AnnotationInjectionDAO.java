package com.jaredluo.springlearning.beanannotation.injection;

import org.springframework.stereotype.Repository;

@Repository
public class AnnotationInjectionDAO {

	public void save(String data) {
		System.out.println("保存数据：" + data);
	}
}
