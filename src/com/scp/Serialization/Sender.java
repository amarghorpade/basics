package com.scp.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 10;
	int j = 20;
}

class Sender {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	}
}
/*
class Receiver {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "-----" + d2.j);
	}
}*/