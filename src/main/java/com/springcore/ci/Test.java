package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
    Person temp = (Person) context.getBean("person1");
    Addtion temAddtion = (Addtion) context.getBean("add");
    System.out.println(temp);
    temAddtion.dosum();
	}

}
