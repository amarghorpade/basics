package com.scp.basic;

public class NullObjectDemo 
{
	
	public static void main(String[] args) 
	{
		Z abc= new Z();
		abc.m1();
		abc=null;
		abc.m1();
	}

}

class Z
{
	void m1()
	{
		System.out.println("In m1 method");
	}
}