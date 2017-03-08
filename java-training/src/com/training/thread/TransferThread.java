package com.training.thread;

public class TransferThread implements Runnable {

	BanckAccount bc;

	public TransferThread() {
		bc = new BanckAccount();
	}

	@Override
	public void run() {
		while (true) {
			synchronized (bc) {
				int from = (int) Math.floor(Math.random() * 5);
				int to = (int) Math.floor(Math.random() * 5);
				Thread t = Thread.currentThread();
				bc.transfer(from, to, t.getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

	public static void main(String[] args) {
		TransferThread transferThread = new TransferThread();

		Thread thread1 = new Thread(transferThread);
		Thread thread2 = new Thread(transferThread);
		Thread thread3 = new Thread(transferThread);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
