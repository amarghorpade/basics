package com.scp.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class GenericCursur 
{

	public static <T extends Collection<? extends Object>> void  MyListIterator(T t)
	{
		
		System.out.println("IN MyListIterator Iterator ");
		if(t instanceof Product)
		{
			Iterator itr=t.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		else {
			System.out.println("Not In IF condition");
		}
	}

	public static <T extends List<? extends Object>> void  MyProdListIterator(T t)
	{
		ListIterator litr= t.listIterator();
		System.out.println("-------------Linked List-----------------");
		while(litr.hasNext())
		{
			System.out.println(litr.next());			
		}
	}
	
	public static<T extends Map<? extends Object, ? extends Object>> 
	void MyIterator(T t) 
	{
		Set set=t.keySet();
		Iterator itr=set.iterator();
		while (itr.hasNext()) 
		{
			Object o=itr.next();
			System.out.println("Key---"+o+"Value---"+t.get(o));
		}	
	}
}