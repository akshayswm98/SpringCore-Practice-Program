package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.ElectricityBillCalculator;

public class Main 
{
	public static void main(String[] args) 
	{
		String path ="/com/aktech/resources/ApplicationContext.XML";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		ElectricityBillCalculator billCalculator = (ElectricityBillCalculator)context.getBean("bill");
		billCalculator.calculateBill();
	}

}
