package com.scp.ObjectCreationWays;

public class UsingNewInstancce
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{	
		ObjectCreation ob=(ObjectCreation) Class.forName("com.scp.ObjectCreationWays.ObjectCreation").newInstance();
		System.out.println(ob.name);
	}
}
