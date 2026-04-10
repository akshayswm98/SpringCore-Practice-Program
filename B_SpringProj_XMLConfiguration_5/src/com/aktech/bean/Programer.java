package com.aktech.bean;

public class Programer {
	private String name;
	private Laptop lp;

	public Programer() {
		super();
		System.out.println("Programmer Bean Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLp() {
		return lp;
	}

	public void setLp(Laptop lp) {
		this.lp = lp;
	}

	
}
