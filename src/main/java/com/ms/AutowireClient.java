package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("info.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Emp emp=context.getBean("emp",Emp.class);
		System.out.println(emp);
		
		System.out.println(context.getBean("company",Company.class));
	}

}
