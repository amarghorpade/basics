package com.scp.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class StaticDemo {

	
	//java.lang.StackOverflowError
/*	void s1()
	{
		s2();
	}
	
	
	 void s2() {
		 s1();
		
	}
*/

	//Recursive constructor Invocation not allowed
	/*StaticDemo()
	{
		this(10);
	}
	StaticDemo(int i)
	{
		this();
	}*/
	
	void z1()
{	
	try
	{
		System.out.println(10/0);
	}
	catch(Exception o) 
	{
		System.out.println(o.getMessage());
	}
	finally
	{
		System.out.println("in finally");
	}
}	
	static
	{
		@SuppressWarnings("unused")
		int i=10;
	}
	
	void m1(Object a)
	{
		System.out.println("Oject accept method");
	}

	void m1(ArrayList al) 
	{
		System.out.println("Arraylist accept method");

	}

	public static void main(String[] args) {
		
		StaticDemo ad= new StaticDemo();
		//ad.m1(null);
		//int i=0;
		//System.out.println(i);
		//ad.s1();
		ad.z1();
		HashMap m= new HashMap<>();
		m.hashCode();
		ad.hashCode();
	}

}