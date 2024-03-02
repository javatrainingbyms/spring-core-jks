package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaClient {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);

	}

}
