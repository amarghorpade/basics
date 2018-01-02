package com.scp.basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortingComparable 
{
	public static void main(String[] args)
	{
	/*	Integer i1=new Integer(10);
		
		List list= new ArrayList();
		list.add(10);
		list.add(24);
		list.add(23);
		list.add(101);
		list.add(1);
		list.add(30);
		list.add(14);
		list.add(8);
		list.add(17);
		list.add(67);
		
		Iterator itr= list.iterator();
		System.out.println("List without Sort.........");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(list);
		System.out.println("List with Sort.........");
		Iterator itr1= list.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}*/
		
		Product p1= new Product(10, "Samsung");
		Product p2= new Product(22, "Nokia");
		Product p3= new Product(1, "Samsung");
		Product p4= new Product(23, "Nokia");
		Product p5= new Product(101, "Samsung");
		Product p6= new Product(9, "Nokia");
		Product p7= new Product(1001, "Samsung");
		Product p8= new Product(5, "Nokia");
		List<Product> plist= new ArrayList<Product>();	
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
		plist.add(p7);
		plist.add(p8);
		plist.add(p1);
		
		Collections.sort(plist);
		Iterator<Product> pitr=plist.iterator();
		while(pitr.hasNext())
		{
			System.out.println(pitr.next());
			//System.out.println("\n");
		}
	}

}
	
