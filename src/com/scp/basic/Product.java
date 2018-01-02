package com.scp.basic;

public class Product implements Comparable<Product>
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
	public Product(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + "]";
	}
	
	/*
	 *  0 == equels
	 *  - == left side value is small
	 *  + == left side value is small
	 * */
	
	@Override
	public int compareTo(Product o) 
	{
		
		return o.pid-this.pid ;
	}
}

