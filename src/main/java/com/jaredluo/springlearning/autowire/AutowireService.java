package com.jaredluo.springlearning.autowire;

public class AutowireService {

	private AutowireDAO autowireDAO;
	//
	// public void setAutowireDAO(AutowireDAO autowireDAO) {
	// this.autowireDAO = autowireDAO;
	// }

	public AutowireService(AutowireDAO autowireDAO) {
		this.autowireDAO = autowireDAO;
	}

	public void say(String word) {
		autowireDAO.say(word);
	}
}
