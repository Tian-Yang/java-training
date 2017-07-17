package com.training.object;

import java.util.Date;

public class ObjectDate {

	private transient long fastTime;

	// 无参构造方法
	public ObjectDate() {

		// 利用有参构造方法，初始化实例变量
		this(System.currentTimeMillis());
	}

	public ObjectDate(Long time) {
		fastTime = time;
	}
	
	public long getTime(){
		return fastTime;
	}
	
	public static void test(){
		System.out.println("static test....");
	}


	public static void main(String[] args) {
		Date d = new Date();
		
		ObjectDate  dt = new ObjectDate();
		
		dt.test();
		
	}
}
