package com.jaredluo.springlearning.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource(value = "classpath:spring-importresource.xml")
public class StoreConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public StringStore stringStore() {
		return new StringStore();
	}

	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}

	@Bean
	public Store testGStore() {
		System.out.println("Test G Store stringStore:" + stringStore.getClass().getName());
		System.out.println("Test G Store integerStore:" + integerStore.getClass().getName());
		return new StringStore();
	}

	@Value("${url}")
	private String url;
	@Value("${username}")
	private String userName;
	@Value("${password}")
	private String password;

	@Bean
	public MyDriverMananger myDriverManager() {
		return new MyDriverMananger(url, userName, password);
	}

	@Autowired
	private Store<String> stringStore;
	@Autowired
	private Store<Integer> integerStore;
}
