package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context	=  new ClassPathXmlApplicationContext("com/springcore/lifecycle/Cookconfig.xml");
//	        Cook cook = (Cook) context.getBean("c1");
//	        System.out.println(cook);
	        
	        context.registerShutdownHook();
	        
	        
//	        System.out.println("------------------------------------");
//	        
//	        Pepsi pepsi =(Pepsi) context.getBean("p1");
//	        System.out.println(pepsi);
	        
		
		    Exmple exmple = (Exmple) context.getBean("e1");
		    
		    System.out.println(exmple);

	}

}
