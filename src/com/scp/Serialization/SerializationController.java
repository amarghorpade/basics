package com.scp.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationController
{
	 public static void main(String[] args) throws Exception, IOException
	 {
		   File f= new File("a.txt");
		   SerializationDemoWriteRead cp= new SerializationDemoWriteRead("Ankita","12345Atul");  
		   ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));  
	       out.writeObject(cp);  
	       
	      
	       ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
	       cp=(SerializationDemoWriteRead)in.readObject();
	       String str=cp.getPassword();
	       System.out.println("After deserialize user is: " +cp.getUserName()+" and password is:"+str.substring(5));   
	   }
}
