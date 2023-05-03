package com.springcore.ci;

public class Addtion {
	
	private int a ;
	private int b;
	
	
	
	
	public Addtion(int a, int b) {
		
		this.a= a;
		this.b= b;
		
		System.out.println("contrutor :- int, int");
		
	}
	
public Addtion(double a, double b) {
		
		this.a= (int) a;
		this.b= (int) b;
		
	System.out.println("constructor :- double, double");
	}
	
	
	
	
//	public Addtion(String a, String b) {
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		
//		System.out.println("constructor : String, String");
//	}
	public void dosum() {
		
		System.out.println("sum is="+(this.a + this.b));
	}

}
