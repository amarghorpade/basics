package com.scp.basic;

import java.util.Comparator;

public class SortByName implements Comparator<Product1> {

	@Override
	public int compare(Product1 o1, Product1 o2) 
	{
		return o1.getpName().compareTo(o2.getpName());
	}

}
