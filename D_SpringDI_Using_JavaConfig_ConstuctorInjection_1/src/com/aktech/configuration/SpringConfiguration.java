package com.aktech.configuration;
//Java class Configuration Using Constructor Injection
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aktech.bean.Address;
import com.aktech.bean.Student;

@Configuration
public class SpringConfiguration 
{
	@Bean
	public Address addr()
	{
		Address address = new Address(112, "Amravati", 444401);
		return address;
	}
	
	
	@Bean
	public Student std()
	{
		Student student = new Student("Akshay", 101, addr());//inject object.
		
		return student;
	}
}
