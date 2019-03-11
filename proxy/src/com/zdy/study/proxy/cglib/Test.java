package com.zdy.study.proxy.cglib;

import com.zdy.study.proxy.GreatCoder;

/**
 * 1.��Ҫ����cglib��jar�ļ�,����Spring�ĺ��İ����Ѿ�������Cglib����,����ֱ������spring-core-*.jar����.
 * 2.���빦�ܰ���,�Ϳ������ڴ��ж�̬�������� 
 * 3.������಻��Ϊfinal,���򱨴�
 * 4.Ŀ�����ķ������Ϊfinal/static,��ô�Ͳ��ᱻ����,������ִ��Ŀ���������ҵ�񷽷�.
 */
public class Test {
	public static void main(String[] args) {
		GreatCoder gc = new GreatCoder();
		GreatCoder pf = (GreatCoder) new ProxyFactory(gc).getProxyInstance();
		pf.code();
	}
}
