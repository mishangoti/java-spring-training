package com.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/config.xml");
		// register shut down hook
		context.registerShutdownHook();

//		Samosa s1 = (Samosa) context.getBean("samosa1");
//		System.out.println(s1);
		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
//
//		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
//		System.out.println(p1);
		
		Jalebi j1 = (Jalebi) context.getBean("jalebi1");
		System.out.println(j1);
		
	}
}

