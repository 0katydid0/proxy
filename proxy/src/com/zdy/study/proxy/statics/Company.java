package com.zdy.study.proxy.statics;

import com.zdy.study.proxy.Codable;

/**
 * ¹«Ë¾
 * @author Administrator
 *
 */
public class Company implements Codable{

	private Codable coder;
	
	public Company(Codable coder) {
		this.coder=coder;
	}
	
	@Override
	public void code() {
		System.out.println("in a company ");
		coder.code();
	}

}
