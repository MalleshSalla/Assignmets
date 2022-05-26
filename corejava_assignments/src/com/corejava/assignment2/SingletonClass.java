package com.corejava.assignment2;

public class SingletonClass {
	private static SingletonClass a = null;

	private SingletonClass() 
	{
		System.out.println("Object Created");
	}

	public static void createObject()
	{
		if(a==null)
		{
			a = new SingletonClass();
		}
		else
		{
			System.out.println("Cannot Create");
		}
	}
	
	public static void main(String[] args) 
	{
		SingletonClass.createObject();
		SingletonClass.createObject();
		SingletonClass.createObject();	
	}
}
