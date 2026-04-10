package com.aktech.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.app.DiscountCalculator;

public class MainApp 
{
	public static void main(String[] args) 
	{
		String path = "com/aktech/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		DiscountCalculator dscl = (DiscountCalculator) context.getBean("discountCalculator");
		System.out.println("Discount Calculator: "+dscl.calculateDiscount());
	}
}
