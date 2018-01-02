package com.scp.basic;

class Test 
{
	float p=10.23f;
	double f=1.03;
	int i; 
	static int b;
	static
	{
		System.out.println("In Static block");
	}
	
	{
		System.out.println("In Instance block");
		b=100;
	}
	
	public static void main(String[] args)
	{
		System.out.println("In Main Method");
		Test t1= new Test();
		System.out.println(b);
	}
}