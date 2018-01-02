package com.scp.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestSortingComparator
{

	public static void main(String[] args)
	{
		Product1 p1= new Product1(10, "A");
		Product1 p2= new Product1(22, "B");
		Product1 p3= new Product1(1, "c");
		Product1 p4= new Product1(23, "d");
		Product1 p5= new Product1(101, "e");
		Product1 p6= new Product1(9, "F");
		Product1 p7= new Product1(1001, "g");
		Product1 p8= new Product1(5, "H");
		List<Product1> plist= new ArrayList<Product1>();	
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
		plist.add(p7);
		plist.add(p8);
		plist.add(p1);
		
/*
 * 1st Way
 * 		Collections.sort(plist, p1.comparebyId);
		
		Iterator<Product1> ire= plist.iterator();
		while (ire.hasNext()) 
		{
			System.out.println(ire.next());
			
		}
*/	
		/* 2nd Way
		 * 
		 * 
		 * Collections.sort(plist, new Comparator<Product1>()
		{
			@Override
			public int compare(Product1 o1, Product1 o2) {
				
				return o1.getpName().compareTo(o2.getpName());
			}
			
		});
		
		Iterator<Product1> ire= plist.iterator();
		while (ire.hasNext()) 
		{
			System.out.println(ire.next());
			
		}*/
		
		
		Collections.sort(plist, new SortById());
		System.out.println("Sort By Id--");		
		Iterator<Product1> ire= plist.iterator();
		while (ire.hasNext()) 
		{
			System.out.println(ire.next());			
		}
		
		Collections.sort(plist, new SortByName());
		System.out.println("Sort By Name---");
		Iterator<Product1> ire1= plist.iterator();
		while (ire1.hasNext()) 
		{
			System.out.println(ire1.next());
			
		}
	}

}
