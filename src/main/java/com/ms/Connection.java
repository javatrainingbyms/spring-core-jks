package com.ms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import lombok.Data;

@Data
public class Connection {
	private String url;
	private String uid;
	private String password;

}
