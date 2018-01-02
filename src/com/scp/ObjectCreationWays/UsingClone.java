package com.scp.ObjectCreationWays;

public class UsingClone 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		ObjectCreation ob= new ObjectCreation();
		System.out.println(ob.name);
		ObjectCreation ob2=(ObjectCreation) ob.clone();
		System.out.println(ob2.name);
	}
	
}
