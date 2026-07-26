package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.config.SpringConfig;
import com.amazon.beans.Account;

public class AccountMain
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Account acc = (Account) context.getBean("acc1");
		acc.displayAccountInfo();
	}
}
