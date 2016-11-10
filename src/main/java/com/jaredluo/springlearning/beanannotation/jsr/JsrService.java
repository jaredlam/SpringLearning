package com.jaredluo.springlearning.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrService {

	@Resource
	private JsrDAO jsrDAO;

	public void save() {
		jsrDAO.save();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("jsr init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("jsr destroy");
	}
}
