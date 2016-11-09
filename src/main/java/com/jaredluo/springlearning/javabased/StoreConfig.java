package com.jaredluo.springlearning.javabased;

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
	public Store stringStore() {
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

}
