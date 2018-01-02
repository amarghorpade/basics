package com.scp.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable 
{
	final int i;
	int j=50;
	
	public SerializationDemo() 
	{
		i=6000;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		/*SerializationDemo sd1= new SerializationDemo();
		FileOutputStream fos= new FileOutputStream("abc.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(sd1);*/
		
		FileInputStream fis= new FileInputStream("abc.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		SerializationDemo sd=(SerializationDemo)ois.readObject();
		System.out.println(sd.i);
		System.out.println(sd.j);
	}
}