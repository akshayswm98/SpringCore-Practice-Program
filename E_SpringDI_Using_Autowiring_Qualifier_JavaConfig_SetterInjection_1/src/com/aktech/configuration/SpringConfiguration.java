package com.aktech.configuration;
import java.util.ArrayList;
import java.util.List;

//Java class Configuration Using Setter Injection
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aktech.bean.Address;
import com.aktech.bean.Student;
import com.aktech.bean.Subject;

@Configuration
public class SpringConfiguration 
{
	@Bean
	public Address addr1()
	{
		Address address = new Address();
		address.setCity("Amravti");      //using setterInjection 
		address.setHouseNo(112);
		address.setPinCode(444404);
		return address;
	}
	
	@Bean
	public Address addr2()
	{
		Address address = new Address();
		address.setCity("Akola");      //using setterInjection 
		address.setHouseNo(134);
		address.setPinCode(445760);
		return address;
	}
	
	
	@Bean
	public Student std()
	{
		Student student = new Student();
		student.setName("Akshay");
		student.setRollno(101);
		//student.setAddress(addr());   no need to pass object ref.
		return student;
	}
	
	
	@Bean
	public Subject sub()
	{
		Subject subject = new Subject();
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("python");
		list.add("cotlin");
		
		subject.setSubject(list);
		
		return subject;
	}
}
