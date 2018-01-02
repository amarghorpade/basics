package com.scp.basic;

public class InnerClassDemo
{
	String name="Amar Ghorpade";
	static int i=20;
	final int a=25;
	
	void method1()
	{
		final class Local
		{
			int j=10;
			void InnerMethod()
			{
				System.out.println(name);
				System.out.println(a);
				System.out.println(i);
				System.out.println("Inside Local Inner Class...!!");
			}
		}
		Local a =new Local();
		a.InnerMethod();
	}
	static class A
	{
		void MemberMethod()
		{
			System.out.println("Inside Member Inner Class...!!");
		}
	}
	
	public static void main(String[] args) 
	{
		InnerClassDemo demo =new InnerClassDemo();
		demo.method1();
		A a= new InnerClassDemo.A();//when A class is static
		a.MemberMethod();
	}
} 