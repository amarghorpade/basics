package com.scp.basic;

import java.util.Comparator;

public class SortById implements Comparator<Product1>
{

	@Override
	public int compare(Product1 o1, Product1 o2) 
	{
		return o1.getPid()-o2.getPid();
	}

}
