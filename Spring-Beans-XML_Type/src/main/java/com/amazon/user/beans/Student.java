package com.amazon.user.beans;

public class Student
{
	private String name;
	private String emailID;
	private long mobileNo;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmailID()
	{
		return emailID;
	}
	public void setEmailID(String emailID)
	{
		this.emailID = emailID;
	}
	public long getMobileNo()
	{
		return mobileNo;
	}
	public void setMobileNo(long mobileNo)
	{
		this.mobileNo = mobileNo;
	}
	
	public void getDetails()
	{
		System.out.println("Name of Student is : "+name);
		System.out.println("Email ID is : "+emailID);
		System.out.println("Mobile Number : "+mobileNo);

	}

}
