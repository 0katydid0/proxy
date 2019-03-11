package com.zdy.study.proxy.statics;

import com.zdy.study.proxy.Coder;
/**
 * 静态代理目标类和代理类都要实现相同的接口，也就是说每当接口发生改变就要去同时维护目标类和代理类
 *
 */
public class Test {
	public static void main(String[] args) {
		Coder coder = new Coder();
		coder.setName("Tom");
		coder.code();
		System.out.println("------------");
		Company c = new Company(coder);
		c.code();
	}
}
