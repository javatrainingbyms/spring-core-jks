package com.ms;

public class InfoFactory {
	
	private Info info;
	
	//public static Info getInfo() {
	public Info getInfo() {
		info=new Info();
		info.setInformation("some more info...");
		return info;
	}
}
