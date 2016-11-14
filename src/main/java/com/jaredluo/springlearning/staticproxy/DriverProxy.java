package com.jaredluo.springlearning.staticproxy;

public class DriverProxy implements Driver {

	private DriverImpl driverImpl;

	public DriverProxy(DriverImpl driverImpl) {
		this.driverImpl = driverImpl;
	}

	@Override
	public void drive() {
		System.out.println("before drive");
		this.driverImpl.drive();
		System.out.println("after drive");

	}

}
