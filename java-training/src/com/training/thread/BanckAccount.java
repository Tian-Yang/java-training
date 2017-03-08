package com.training.thread;

import java.util.HashMap;
import java.util.Map;

public class BanckAccount {

	private Map<Integer, Double> bankAccounts;

	public BanckAccount() {
		bankAccounts = new HashMap<Integer, Double>();
		for (int i = 0; i < 5; i++) {
			bankAccounts.put(i, 100 * (Math.floor(Math.random() * 100) / 100));
		}
	}

	public void transfer(int from, int to, String thread) {
		Double fAmount = bankAccounts.get(from);
		Double amount = fAmount * (Math.floor(Math.random() * 100) / 100);
		fAmount -= amount;
		bankAccounts.put(from, fAmount);
		Double tAmount = bankAccounts.get(to);
		tAmount += amount;
		bankAccounts.put(to, tAmount);
		System.out.println(thread + "从账户" + from + "转账金额" + amount + "至账户" + to + "转账后账户总额为" + getTotalAmount());
	}

	public Double getTotalAmount() {

		Double totalAmount = 0.00;
		for (Map.Entry<Integer, Double> entry : bankAccounts.entrySet()) {
			totalAmount += entry.getValue();
		}
		return totalAmount;
	}

}
