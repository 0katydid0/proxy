package com.zdy.study.proxy.statics;

import com.zdy.study.proxy.Coder;
/**
 * ��̬����Ŀ����ʹ����඼Ҫʵ����ͬ�Ľӿڣ�Ҳ����˵ÿ���ӿڷ����ı��Ҫȥͬʱά��Ŀ����ʹ�����
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
