package com.aktech.configuration;
//Java class Configuration Using Setter Injection
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
		Address address = new Address();
		address.setCity("Amravti");      //using setterInjection 
		address.setHouseNo(112);
		address.setPinCode(444404);
		return address;
	}
	
	
	@Bean
	public Student std()
	{
		Student student = new Student();
		student.setName("Akshay");
		student.setRollno(101);
		student.setAddress(addr());
		return student;
	}
}
