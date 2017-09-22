package com.training.generic;

/**
 * 苹果
 * @author 14033159
 *
 */
public class Apple extends Fruit {
	
	public String name;
	
	private String age;

	@Override
	void setName(String name) {
		this.name = name;
	}
	
	void getName(){
		System.out.println("apple");
	}

	public String getAge() {
		return "18";
	}
	
	

}
