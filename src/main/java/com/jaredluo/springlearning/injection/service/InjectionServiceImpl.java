package com.jaredluo.springlearning.injection.service;

import com.jaredluo.springlearning.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;

	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {
		System.out.println("Service接收数据：" + arg);
		arg += ":" + hashCode();
		injectionDAO.save(arg);
	}

}
