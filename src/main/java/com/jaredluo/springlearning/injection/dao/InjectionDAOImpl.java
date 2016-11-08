package com.jaredluo.springlearning.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String arg) {
		System.out.println("保存成功：" + arg);
	}

}
