package com.aktech.bean;

public class Laptop implements Computer{
	
	
		public Laptop() {
		super();
		System.out.println("Laptop Bean Created");
	}
		@Override
		public boolean start() {
		System.out.println("Laptop Started");
		return true;
		}

 	

}
