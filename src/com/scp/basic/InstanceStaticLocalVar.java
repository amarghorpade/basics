package com.scp.basic;

public class InstanceStaticLocalVar 
{
	int x=10;
	static int y=1000;
	
	void m1()
	{
		int z;// local variable--- just delared not initialized 
		z=10;
		System.out.println(z); //when we are actually using than we need to initialize it
	}
	
	
	static
	{
	
		{
			System.out.println("In static inside instance");
		}
	}
	
	
	public static void main(String[] args) 
	{
		InstanceStaticLocalVar islv= new InstanceStaticLocalVar();
		int m=y+islv.x;
		System.out.println("value for object 1----  "+m);
		islv.x=100;
		islv.y=200;
		int n=islv.y+islv.x;
		System.out.println("After Changed value for object 1----   "+n);
		
		InstanceStaticLocalVar islv1= new InstanceStaticLocalVar();
		int o=islv1.y+islv1.x;
		System.out.println("value for object 2----   "+o);
		
	}
}
