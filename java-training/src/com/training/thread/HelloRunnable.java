package com.training.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现Runnable接口
 * 
 * @author 14033159
 *
 */
public class HelloRunnable implements Runnable {

	private Map<Integer, Object> numMap;

	{
		numMap = new HashMap<>();
		for (int i = 0; i < 1000; i++) {
			numMap.put(i, i);
		}
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + "取"+i+"值"+ numMap.get(i));
			numMap.remove(i);
		}

	}

	public static void main(String[] args) {
		
		HelloRunnable runnable = new HelloRunnable();

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		
		//设置线程优先级 默认为5 最小为1 最大为10
		thread1.setPriority(10);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
