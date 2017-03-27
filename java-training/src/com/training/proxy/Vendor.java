package com.training.proxy;

public class Vendor implements Sell{

	@Override
	public void sell() {
		System.out.println("sell");
		
	}

	@Override
	public void ad() {
		System.out.println("ad");
	}

}
