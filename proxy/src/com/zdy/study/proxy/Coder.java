package com.zdy.study.proxy;

/**
 * ±‡¬Î‘±
 * @author Administrator
 *
 */
public class Coder implements Codable{

	private String name;
	
	@Override
	public void code() {
		System.out.println(name + " is coding");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
