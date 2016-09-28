package com.training.weakReference;

import java.lang.ref.WeakReference;

/**
 * java弱引用
 * @author 14033159
 *
 */
public class WeakReferenceTest {

	public static void main(String[] args) {
		
		Product productA = new Product("test1", 100);

		WeakReference<Product> weakProductA = new WeakReference<Product>(productA);
	}

}
