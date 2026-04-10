package com.aktech.bean;

public class Desktop implements Computer{

	public Desktop() {
		super();
		System.out.println("Desktop object created");
	}
	
	@Override
	public boolean start() {
		System.out.println("Desktop started");
		return true;
	}
	

}
