package com.ms;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Company {
	private String name;
	private String business;
	
	public Company() {
		name="My Company";
		business="Software Firm";
	}
}
