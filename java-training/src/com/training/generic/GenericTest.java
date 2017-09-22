package com.training.generic;

/**
 * 泛型Test
 * 
 * @author 14033159
 *
 */
public class GenericTest {

	public static void main(String[] args) {
		
		//泛型类
		FruitMixer<Apple> mixer = new FruitMixer<Apple>();
		Apple ap = new Apple();
		ap.setName("苹果");
		mixer.mixer(ap);
		
		
	
	}
}
