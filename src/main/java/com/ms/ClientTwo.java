package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTwo {
public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		DBConnection con1=context.getBean("con",DBConnection.class);
		//System.out.println(con1.getCon());
		System.out.println(con1);
		
		Employee emp1=context.getBean("emp",Employee.class);
		System.out.println(emp1);
		/*
		DBConnection con2=context.getBean("con",DBConnection.class);
		DBConnection con3=context.getBean("con",DBConnection.class);
		System.out.println(con1==con2);
		System.out.println(con2==con3);
		*/
		System.out.println("Completed....");
			
	}
}
