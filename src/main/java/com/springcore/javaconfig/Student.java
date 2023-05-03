package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;
	
		
 public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}



public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

public void studey() {
	
	this.samosa.disply();
	System.out.println("this is spring-fremwork course");
}
	

}
