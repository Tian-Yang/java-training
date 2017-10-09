package com.training.generic;

/**
 * 水果抽象类
 * 
 * @author 14033159
 *
 */
public abstract class Fruit {

	public String name;

	abstract void setName(String name);
	
	abstract void getPrice();
	
	abstract void getName();

	public <T extends Fruit> void juice(T t) {
		t.getName();
		t.getPrice();
	}

	@Override
	public String toString() {
		return name;
	}
}
