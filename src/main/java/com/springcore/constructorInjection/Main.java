package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ciconfig.xml");
		
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		
		Adition add = (Adition) context.getBean("add");
		add.doSum();
	}
}
