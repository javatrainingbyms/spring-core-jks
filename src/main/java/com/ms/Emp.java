package com.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Emp {
	private String code;
	private String name;
	@Autowired
	private Company company;
	@Autowired
	@Qualifier("address2")
	private Address address;
}
