package com.scp.basic;

import java.util.Comparator;

class Product1
{
	private int pid;
	private String pName;
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}
	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public Product1(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + "]";
	}
	
	Comparator<Product1> comparebyId= new Comparator<Product1>() 
	{
 		@Override
		public int compare(Product1 o1, Product1 o2)
		{
		
			return o1.pName.compareTo(o2.pName);
		}
	};
	
	
}

