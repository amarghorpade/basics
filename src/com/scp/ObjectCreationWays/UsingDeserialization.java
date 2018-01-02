package com.scp.ObjectCreationWays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsingDeserialization
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ObjectCreation ob= new ObjectCreation();
		File file= new File("abc.txt");
		FileOutputStream fis= new FileOutputStream(file);
		ObjectOutputStream oos= new ObjectOutputStream(fis);
		oos.writeObject(ob);
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
		ObjectCreation ob1=(ObjectCreation)ois.readObject();
		System.out.println(ob1.name);
	}
}
