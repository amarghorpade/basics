package com.scp.basic;

public class SuperThisTest
{

	public static void main(String[] args) 
	{
		Pqr a=new Pqr();
	}
}

class Abc extends Xyz
{
	static
	{
		System.out.println("In STATIC block of Abc class");
	}
	{
		System.out.println("In INSTANCE block of Abc class");
	}
}

class Pqr extends Abc
{
	static
	{
		System.out.println("In STATIC block of Pqr class");
	}
	{
		System.out.println("In INSTANCE block of Pqr class");
	}
}
class Xyz
{
	static
	{
		System.out.println("In STATIC block of Xyz class");
	}
	{
		System.out.println("In INSTANCE block of Xyz class");
	}
}