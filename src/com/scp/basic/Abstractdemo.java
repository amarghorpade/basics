package com.scp.basic;

class Ab
{
	int i=10;
	void Gh()
	{
		System.out.println("method of parent class");
	}
	 
	void Ab()
	{
		System.out.println("method of parent class");
	}

}
public class Abstractdemo extends Ab{

	public static void main(String[] args) 
	{
		Ab a= new Abstractdemo();
		a.Ab();
		a.Gh();

	}

	@Override
	void Ab() {
		// TODO Auto-generated method stub
		System.out.println("method of child class");
	}

	void Cd() {
		// TODO Auto-generated method stub
		System.out.println("method of child class");
	}

	void Ef() {
		// TODO Auto-generated method stub
		System.out.println("method of child class");
	}
}
