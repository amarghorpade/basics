package com.scp.basic;

public class NoClassDefFoundError
{
	int z;
	A a;
	
	class Depend extends NoClassDefFoundError
	{
		String name;
	}

	public static void main(String[] args)
	{
		NoClassDefFoundError ndf= new NoClassDefFoundError();
		System.out.println("Successfully Done............!!");
		//Depend d1=new Depend();
	}

}
