package com.jaredluo.springlearning.beanannotation.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotationInjectionService {

//	@Autowired
	private AnnotationInjectionDAO annotationInjectionDAO;

	public void save(String data) {
		System.out.println("Service接收数据：" + data);
		data += this.hashCode();
		annotationInjectionDAO.save(data);
	}

	@Autowired
	public void setAnnotationInjectionDAO(AnnotationInjectionDAO annotationInjectionDAO) {
		this.annotationInjectionDAO = annotationInjectionDAO;
	}
}
