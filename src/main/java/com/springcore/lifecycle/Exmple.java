package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exmple {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Exmple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exmple [subject=" + subject + "]";
	}
    
	@PostConstruct
	public void init() {
		System.out.println("this is init method for postconstruct using");
	
	}
	@PreDestroy
	public void destroy() {
		System.out.println("this is destroy method for preconstruct");
	}
	
	

}
