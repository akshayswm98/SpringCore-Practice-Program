package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		String path="com/aktech/configuration/AplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Student std = context.getBean(Student.class);
		std.display();
		
	}
}
