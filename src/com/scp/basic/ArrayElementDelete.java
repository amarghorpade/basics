package com.scp.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class ArrayElementDelete 
{
	public static void main(String[] args)
	{
		ArrayList ary = new ArrayList();
		ary.add(10);
		ary.add(20);
		ary.add(25);
		ary.add(28);
		ary.add(42);
		ary.add(9);
		Set set = new HashSet();
		while (ary.contains(25)) 
		{
			int b = ary.indexOf(25);
			ary.remove(b);
		}
		System.out.println(ary);
	}
}