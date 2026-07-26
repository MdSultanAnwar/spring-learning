package com.amazon.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.user.beans.Student;

public class StudentMain
{

	public static void main(String[] args)
	{
		String file = "student.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(file);

		Student student = (Student) app.getBean("std");

		student.setName("Arman Anwar");
		student.setEmailID("arman@gmail.com");
		student.setMobileNo(911331560);
		
		student.getDetails();

	}
}
