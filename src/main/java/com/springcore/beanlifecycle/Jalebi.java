package com.springcore.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("price setted");
		this.price = price;
	}

	public Jalebi(String price) {
		super();
		this.price = price;
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending Method");
	}
}
