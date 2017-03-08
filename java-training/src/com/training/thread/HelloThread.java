package com.training.thread;

/**
 * 继承Thread类
 * 
 * @author 14033159
 *
 */
public class HelloThread extends Thread {

	public HelloThread(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			i++;
			System.out.println(this.getName() + " print i:" + i);
		}
	}

	public static void main(String[] args) {
		HelloThread thread = new HelloThread("thread1");
		thread.start();
	}
}
