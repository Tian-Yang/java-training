package com.training.generic;

/**
 * 水果搅拌机泛型类
 * @author 14033159
 *
 * @param <E>
 */
public class FruitMixer<E> {
	
	
	public void mixer(E e){
		System.out.println("搅拌开始...");
		System.out.println(e.toString());
		System.out.println("搅拌结束");
	}
}
