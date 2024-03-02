package com.ms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.ms")
public class ProjectConfig {
	
	@Bean
	public Emp emp() {
		Emp emp=new Emp();
		emp.setCode("E5555");
		emp.setName("ABCDE");
		return emp;
	}
	/*
	@Bean
	public Company company() {
		Company company=new Company();
		company.setName("MS Ltd.");
		company.setBusiness("IT-ITES");
		return company;
	}
	*/
	@Bean
	public Address address1() {
		Address address=new Address();
		address.setHno("1122");
		address.setStreet("AB Road");
		address.setCity("Delhi");
		return address;
	}
	@Bean
	public Address address2() {
		Address address=new Address();
		address.setHno("2233");
		address.setStreet("MG Road");
		address.setCity("Mumbai");
		return address;
	}
	/*
	@Bean(initMethod = "start", destroyMethod = "stop")
	@Lazy
	@Scope("prototype")
	public Employee emp() {
		Employee e=new Employee();
		e.setCode(1111);
		e.setName("dummy-name");
		return e;
	}
	*/
	
	
}
