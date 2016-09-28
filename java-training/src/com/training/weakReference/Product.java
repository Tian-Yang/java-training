package com.training.weakReference;

/**
 * 弱引用测试类
 * @author 14033159
 *
 */
public class Product {

	private String name;

	private int price;

	public Product(String n, int p) {
		this.setName(n);
		this.setPrice(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
