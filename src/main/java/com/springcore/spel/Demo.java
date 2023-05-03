package com.springcore.spel;

 import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{ 12+12 }")
	private int a;
	
	@Value("#{10/2}")
	private int b;
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
    private double p;
	
	@Value("#{new java.lang.String('akash bairagi')}")
	private String name;
	
	@Value("#{8-6>4}")
	private boolean isActive;
	
//    @Value("#{ T(java.lang.Math).PI")
//    private double pi;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return p;
	}

	public void setE(double e) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", z=" + z + ", p=" + p + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
