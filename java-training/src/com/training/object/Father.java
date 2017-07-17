package com.training.object;

public class Father {

	protected String s;

	protected String k = "2";

	public Father() {
		super();
	}

	public Father(String n) {
		s = n;
	}

	public void getS() {
		System.out.println(s);
	}

	public void getK() {
		System.out.println(k);
	}
}
