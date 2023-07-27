package com.springcore.propertyInjectionUsingPschema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.propertyInjectionUsingPschema.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println( "Hello World!" );
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/propertyInjectionUsingPschema/propertyInjectionUsingPschema.xml");

//	        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student2 = (Student) context.getBean("student2");
        System.out.print(student2);
        
        Student student3 = (Student) context.getBean("student3");
        System.out.print(student3);
	}

}
