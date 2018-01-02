package com.scp.threading;

public class UsingThread  
implements Runnable

{	
	public void start(){
           System.out.println("In start() method");
    }

	public void run()
	{
		System.out.println("In run method");
	}
	public static void main(String[] args) 
	{
		UsingThread usingThread= new UsingThread();
		Thread thread= new Thread(usingThread);
		//Thread thread= new Thread();
		//UsingThread usingThread1= new UsingThread();
		//Thread thread1= new Thread(usingThread1);
		thread.start();
		//thread1.start();
	}
}