package com.springcore.lifecycle;

public class Cook {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		
		this.price = price;
	}

	public Cook() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cook [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("this is inside cook");
	}
	
	public void destroy() {
		System.out.println("this is inside destroy method");
		
	}
	
	

}
