package com.zdy.study.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.zdy.study.proxy.Codable;
import com.zdy.study.proxy.Coder;
/**
 * 代理对象不需要实现接口,但是目标对象要实现接口
 */
public class Test {
	public static void main(String[] args) {
		Coder c = new Coder();
		c.setName("Sam");
		Codable proxy = (Codable)Proxy.newProxyInstance(c.getClass().getClassLoader(), c.getClass().getInterfaces(), new InvocationHandler() {
			
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("here");
				Object obj = method.invoke(c, args);
				System.out.println("coded");
				return obj;
			}
		});
		proxy.code();
	}
}
