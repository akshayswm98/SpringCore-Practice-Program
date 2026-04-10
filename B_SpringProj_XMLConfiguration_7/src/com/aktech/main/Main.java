package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aktech.bean.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		String path="/com/aktech/resources/ApplicationContext.XML";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Student std = (Student) context.getBean("stdId");
		System.out.println("Student Name Is: "+std.getName());
		System.out.println("Student RollNo Is: "+std.getRollno());
		System.out.println("Student Email Is: "+std.getEmail());
		
	}

}
