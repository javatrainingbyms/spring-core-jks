package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		//here we need an Employee object
		
		//here we will ask spring-container to give us an employee object
		
		//1) create a container
			ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//2) call getBean method to demand a bean
			//Employee emp1=(Employee)context.getBean("e1");
			Employee emp1=context.getBean("e1",Employee.class);
			System.out.println(emp1);
			
		/*
		Employee emp=new Employee();
		emp.setCode(111);
		emp.setName("abc");
		Address address=new Address();
		address.setHno("501");
		address.setStreet("mgroad");
		address.setCity("indore");
		emp.setAddress(address);
		System.out.println(emp);
		*/
	}

}
