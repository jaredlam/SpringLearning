package com.jaredluo.springlearning.javabased;

public class MyDriverMananger {

	private String url;
	private String userName;
	private String password;

	public MyDriverMananger(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;

		System.out.println("url:" + this.url);
		System.out.println("user name:" + this.userName);
		System.out.println("password:" + this.password);

	}
}
