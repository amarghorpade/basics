package com.scp.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionMap 
{
	static String s1 = null;
	public static void main(String[] args) 
	{
		HashMap<Object, Object> htb = new HashMap<>();
		htb.put(11, "Akshay");
		htb.put(21, null);
		htb.put(2, "Abhi");
		htb.put(1, "Abhi");
		htb.put(31, "Abhi");

		Set<Object> s = htb.keySet();
		Object str;
		Iterator<Object> itr = s.iterator();
		while (itr.hasNext())
		{
			str = itr.next();
			if (s1 == null) {
				if (htb.get(str) == null) {
					System.out.println(str);
				}
			} else if (s1.equals(htb.get(str))) {
				System.out.println(str);
			}
		}
	}
}
