package com.scp.basic;

public class ReturnCheck
{

	int i=100;
	int m1()
	{
		try 
		{
			i=i/0;
			//return 10;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return i;
		}
		finally
		{
			//return 25;
		}
		return 10000; 
	}
	
	public static void main(String[] args)
	{
		ReturnCheck rc= new ReturnCheck();
		int j=rc.m1();
		System.out.println(j);
	}

}
