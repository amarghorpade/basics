package com.scp.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	int sRoll;
	String sName;
}
public class CollectionTest 
{

	public static void main(String[] args)
	{
		List list= new ArrayList();
		StudentDemo sdemo= new StudentDemo(10000);
		StudentDemo sdemo1= new StudentDemo(20000);
		StudentDemo sdemo2= new StudentDemo(30000);
		list.add(sdemo);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(sdemo1);
		list.add(2);
		list.add(1);
		list.add(sdemo2);
		
		Iterator it = list.iterator();
		if(it instanceof StudentDemo)
		{
			while(it.hasNext())
			{
				StudentDemo sd=(StudentDemo) it.next();
				int j=sd.i;
				System.out.println(j);
			}	
		}	
		else
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	
	
	
	
	}

}

class StudentDemo
{
	int i;

	public StudentDemo(int i)
	{
		super();
		this.i = i;
	}
	
}
