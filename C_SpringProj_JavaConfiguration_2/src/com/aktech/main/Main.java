package com.aktech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aktech.bean.Student;
import com.aktech.resources.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std1 = (Student) context.getBean("stdObj1");
		std1.getData();
		
		System.out.println("---------------------------------------");
		
		Student std2 = (Student)context.getBean("stdObj2");
		std2.getData();
		
		
	}
}
