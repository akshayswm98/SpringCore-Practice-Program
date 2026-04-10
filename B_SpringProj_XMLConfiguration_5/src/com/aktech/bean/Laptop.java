package com.aktech.bean;

public class Laptop {
	private String brand;

	public Laptop() {
		super();
		System.out.println("Laptop Bean Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Laptop Brand name initialize");
	}
	
	

}
