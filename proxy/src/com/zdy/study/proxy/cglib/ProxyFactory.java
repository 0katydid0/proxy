package com.zdy.study.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
	//ά��Ŀ�����
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    
  //��Ŀ����󴴽�һ���������
    public Object getProxyInstance(){
        //1.������
        Enhancer en = new Enhancer();
        //2.���ø���
        en.setSuperclass(target.getClass());
        //3.���ûص�����
        en.setCallback(this);
        //4.��������(�������)
        return en.create();

    }

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("��ʼ����...");
        //ִ��Ŀ�����ķ���
        Object returnValue = arg1.invoke(target, arg2);
        System.out.println("����ִ��...");
        return returnValue;
	}

}
