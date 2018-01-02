package com.scp.ObjectCreationWays;

import java.lang.reflect.Field;
import java.lang.reflect.*;


public class UsingforName 
{

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class abc= Class.forName("com.scp.ObjectCreationWays.ObjectCreation");
		
		System.out.println(abc.getName());
		
		Field[] f=abc.getDeclaredFields();
		for(Field fld : f)
		{
			System.out.println("methods are-- "+fld.getName());
		}
		Method[] m=abc.getDeclaredMethods();
		for(Method mq:m)
		{
			System.out.println("in for loop");
			System.out.println("methods are-- "+mq.getName());
		}	
	}

}
