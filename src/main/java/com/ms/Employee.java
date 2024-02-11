package com.ms;

import java.util.Properties;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int code;
	private String name;
	private Address address;
	private Set<String> emails;
	//private Map<String,String> phones;
	private Properties phones;
}
