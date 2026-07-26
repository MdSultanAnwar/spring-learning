package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.config.StudentConfig;
import com.amazon.beans.Student;

public class StudentMain
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student std = (Student) context.getBean("std");
		std.displayDetailsInfo();
	}

}
