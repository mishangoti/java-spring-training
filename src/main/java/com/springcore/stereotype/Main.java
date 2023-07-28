package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");

		Student s1 = (Student) context.getBean("student");
		System.out.println(s1);
		
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getClass().getName());
	
	}
}
