package com.amazon.beans;

public class Account
{
	private String accountHolder;
	private String ifscCode;
	private String accountNumber;

	public String getAccountHolder()
	{
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder = accountHolder;
	}

	public String getIfscCode()
	{
		return ifscCode;
	}

	public void setIfscCode(String ifscCode)
	{
		this.ifscCode = ifscCode;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public void displayAccountInfo()
	{
		System.out.println("Account [accountHolder=" + accountHolder + ", ifscCode=" + ifscCode + ", accountNumber="
				+ accountNumber + "]");
	}

}
