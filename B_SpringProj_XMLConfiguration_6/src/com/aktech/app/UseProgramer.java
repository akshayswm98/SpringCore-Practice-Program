package com.aktech.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Laptop;
import com.aktech.bean.Programer;

public class UseProgramer {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/aktech/resources/applicationContext.xml");
		
		
		Programer p1 = (Programer) container.getBean("proObj1");
		Programer p2 = (Programer) container.getBean("proObj2");
		
		
		System.out.println("First Programer Name: "+p1.getName());
		p1.WriteCode();
		System.out.println("======================================");
		
		System.out.println("Second Programer Name: "+p2.getName());
		p2.WriteCode();
	
		
	}

}
