package com.training.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理(当我们得到一个对象,想动态为其一些方法每次被调用前后追加一些操作时,我们将会使用到动态代理)
 * 
 * @author skySun
 *
 */
public class DynamicProxy implements InvocationHandler {

	private Object obj;

	public DynamicProxy(Object obj) {
		this.obj = obj;
	}

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");

		Object result = method.invoke(obj, args);

		System.out.println("after");

		return result;
	}

}
