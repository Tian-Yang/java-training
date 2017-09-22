package com.training.generic;

/**
 * 水果抽象类
 * 
 * @author 14033159
 *
 */
public abstract class Fruit {

	protected String name;

	abstract void setName(String name);

	@Override
	public String toString() {
		return name;
	}
}
