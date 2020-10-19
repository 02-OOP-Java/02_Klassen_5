package com.cc.java;

public class Cat 
{
	// Fields
	public String name;
	public String furColor;
	public int age;
	
	/**
	 * @param name
	 * @param furColor
	 * @param age
	 */
	public Cat(String name, String furColor, int age) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
	}

	public String tellYourAttributes(String flag) {
		switch (flag) 
		{	
			case "#name":
				return "Name: " + this.name;
			case "#color":
				return "Fellfarbe: " + this.furColor;
			case "#age": 
				return "Alter: " + this.age;			
			default:
				return "Something went wrong!";
		}	
	}
	
}
