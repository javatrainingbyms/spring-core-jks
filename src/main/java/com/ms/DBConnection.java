package com.ms;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DBConnection implements InitializingBean {
	private String dbUrl;
	private String dbUid;
	private String dbPassword;
	private String authorName;
	private String authorEmail;
	private Connection con=new Connection();
	
	public void connect() {
		con.setUrl(dbUrl);
		con.setUid(dbUid);
		con.setPassword(dbPassword);
	}
	
	public DBConnection() {
		System.out.println("Connection Created...!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		connect();
	}
}
