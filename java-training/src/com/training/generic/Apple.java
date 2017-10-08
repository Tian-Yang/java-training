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
	public void setName(String name) {
		this.name = name;
	}
	
	public void getName(){
		System.out.println("apple");
	}

	public String getAge() {
		System.out.println(18);
		return "18";
	}
	
	

}
