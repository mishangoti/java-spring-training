package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired // to automate Injection with Property Injection
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
//	@Autowired // to automate Injection with setter and getter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired // to automate injection with Constructor injection
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}	
}
