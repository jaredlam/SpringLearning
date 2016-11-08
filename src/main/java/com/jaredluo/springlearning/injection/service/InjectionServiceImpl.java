package com.jaredluo.springlearning.injection.service;

import com.jaredluo.springlearning.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;

	public InjectionDAO getInjectionDAO() {
		return injectionDAO;
	}

	@Override
	public void save(String arg) {
		System.out.println("Service接收数据：" + arg);
		arg += hashCode();
		injectionDAO.save(arg);
	}

}
