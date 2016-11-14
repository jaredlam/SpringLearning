package com.jaredluo.springlearning.staticproxy;

public class DriverImpl implements Driver {

	@Override
	public void drive() {
		System.out.println("driving...");
	}

}
