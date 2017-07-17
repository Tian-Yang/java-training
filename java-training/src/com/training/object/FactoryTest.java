package com.training.object;

import java.text.NumberFormat;
import java.util.StringTokenizer;

public class FactoryTest {
	
	public static void main(String[] args) {
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		
		StringTokenizer st = new StringTokenizer("DF123123123 123123");
		System.out.println(	st.nextToken());
	}
}
