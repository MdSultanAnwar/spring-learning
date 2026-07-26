package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.beans.Student;

@Configuration
public class StudentConfig
{

	@Bean("std")
	public Student createDetails()
	{
		Student student = new Student();
		student.setName("Md Sultan Anwar");
		student.setCourse("BTECH");
		student.setFees(120000);
		return student;
	}

}
