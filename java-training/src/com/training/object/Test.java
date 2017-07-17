package com.training.object;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String str1 = "a";
		System.out.println(Arrays.asList(str1.split("|")).size());
		System.out.println(Arrays.asList(str1.split("\\|")).size());
		String str2 = "a|b";
		System.out.println(Arrays.asList(str2.split("|")).size());
		System.out.println(Arrays.asList(str2.split("\\|")).size());
		
	}
}
