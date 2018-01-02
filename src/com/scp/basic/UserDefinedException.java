package com.scp.basic;

public class UserDefinedException
{
	int m1(int i) throws DivisibleException 
	{
		if(i==100)
		{	
			throw new DivisibleException("Number is 100");
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		int i=100;
		UserDefinedException ude= new UserDefinedException();
		try 
		{
			ude.m1(i);
		}
		catch (DivisibleException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Value of i is--- "+i);
	}
}
