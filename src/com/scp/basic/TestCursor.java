package com.scp.basic;

import java.util.*;

public class TestCursor {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
/*		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add("abcd");
		list.add(5);
		list.add("Amar");
		list.add(22);
		GenericCursur.MyListIterator(list);
*/		
		
	/*	LinkedList<Product> lnklst=new LinkedList();
		lnklst.add(p1);
		lnklst.add(p2);
		GenericCursur.MyProdListIterator(lnklst);

	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "pune");
		map.put(2, "sangli");
		GenericCursur.MyIterator(map);
*/		
		/*HashMap<Product, String> hm = new HashMap<Product, String>();
		hm.put(p1, "pune");
		hm.put(p2, "sangli");
		GenericCursur.MyIterator(hm);
*/		
		Product p1= new Product(101, "Samsung");
		Product p2= new Product(102, "Apple");		
		Student1 s1=new Student1(1,"Amar");
		Student1 s2=new Student1(1,"Sagar");
		
		HashSet<Object> hset=new HashSet<Object>();
		hset.add(s1);
		hset.add(s2);
		hset.add(p1);
		hset.add(p2);
		GenericCursur.MyListIterator(hset);
	}

	
	
}
