package com.aktech.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.aktech.bean.Student;

@Component
public class SpringConfigFile 
{
	@Bean("stdObj1")
	public Student initialiseData1()
	{
		Student std = new Student();
		std.setName("Akshay");
		std.setRollno(103);
		std.setEmail("akshay@gmail.com");
		return std;
	}
	
	
	@Bean("stdObj2")
	public Student initialiseData2()
	{
		Student std = new Student();
		std.setName("Vaishnavi");
		std.setRollno(104);
		std.setEmail("vaishnavi@gmail.com");
		return std;
	}
}
