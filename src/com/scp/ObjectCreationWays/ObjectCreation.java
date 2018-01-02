package com.scp.ObjectCreationWays;

import java.io.Serializable;

public class ObjectCreation implements Cloneable, Serializable {
	private int id = 20;
	String name = "amar";

	public static void main(String[] args) {
		ObjectCreation obc = new ObjectCreation();
		System.out.println(obc.id);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
