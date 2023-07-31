package com.springcore.springEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springEL/springelconfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		
		System.out.println(d1);
	
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression ex = temp.parseExpression("34+12");
		System.out.println(ex.getValue());
	}

}
