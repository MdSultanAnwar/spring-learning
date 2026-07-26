package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.beans.Account;

@Configuration // This (@Configuration) tells that this class is source of bean definition
public class SpringConfig
{

	// How do we define the bean?
	@Bean("acc1")
	public Account createAccount()
	{
		Account account = new Account();
		account.setAccountHolder("Batch, 9th March");
		account.setAccountNumber("37817108630");
		account.setIfscCode("SBIN0031002");
		return account;

	}

}
