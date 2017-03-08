package com.training.thread;

/**
 * 实现Runnable接口
 * 
 * @author 14033159
 *
 */
public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is run");
	}

	public static void main(String[] args) {
		HelloRunnable runnable = new HelloRunnable();

		new Thread(runnable).start();
	}

}
