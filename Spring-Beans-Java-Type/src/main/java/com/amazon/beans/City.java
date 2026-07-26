package com.amazon.beans;

public class City
{
	private String name;
	private String state;
	private int code;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public void getDetails()
	{
		System.out.println("City [name=" + name + ", state=" + state + ", code=" + code + "]");
	}

}
