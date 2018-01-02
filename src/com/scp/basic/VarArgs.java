package com.scp.basic;

public class VarArgs {

	/*
	 * public VarArgs() { super(); // TODO Auto-generated constructor stub }
	 */
	/*
	 * void m1(int a) { System.out.println("only a"); }
	 * 
	 * void m2(int a, int z, int... b) { System.out.println(a);
	 * System.out.println(z); System.out.println(b.length);
	 * 
	 * 
	 * 
	 * for(int j=0;j<b.length; j++) {
	 * System.out.println("two parameter with var args-  "+b[j]); } }
	 * 
	 * void m3(int ...a) { System.out.println("only var args"); }
	 * 
	 * 
	 */
	
	static
	{
		 String args[]={"10","20","30"};
	}
	
	public static void main(String[] args)
	{
		System.out.println(args.length);
		for (String a : args) {
			System.out.println(a);
		}
		// VarArgs va= new VarArgs();
		// va.m2(1,2,3,4,5,67,8,9,7,43,4);
	}

}
