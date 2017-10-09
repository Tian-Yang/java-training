package com.training.generic;

/**
 * 苹果
 * @author 14033159
 *
 */
public class Apple extends Fruit {
	
	private String name;
	
	private String age;

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public void getName(){
		System.out.println(this.name);
	}

	public String getAge() {
		System.out.println(18);
		return "18";
	}

	@Override
	void getPrice() {
		System.out.println("5毛");
	}
	
	

}
