package com.springcore.springEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	
	// spel expression
	@Value("#{24+23}")
	private int y;
	
	// static method calling
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	// static variable calling
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	// creating object 
	@Value("#{new java.lang.String('Mishan Goti')}")
	private String name;
	
	// boolean type value
	@Value("#{8>3}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	

	
}
