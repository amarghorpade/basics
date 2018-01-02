package com.scp.basic;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set_Student {
	String name;
	int id;

	// If we didn't add this method than duplicates are allowed in This SET
	public int hashCode()
	{
		return id;
	}

	public boolean equals(Object obj)
	{
		if (obj == null)
		{
			return false;
		}
		Collection_Set_Student s1 = (Collection_Set_Student) obj;
		if (this.id == s1.id) 
		{
			return true;
		}
		return false;
	}

	Collection_Set_Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	public static void main(String args[]) {
		Set<Collection_Set_Student> myDataBase = new HashSet<>();

		Collection_Set_Student s1 = new Collection_Set_Student(1, "Krishna");
		Collection_Set_Student s2 = new Collection_Set_Student(2, "Anil");
		Collection_Set_Student s3 = new Collection_Set_Student(1, "Krishna");

		/* Add Data to the HashSet */
		myDataBase.add(s1);
		myDataBase.add(s2);
		myDataBase.add(s3);

		System.out.println(myDataBase);

	}
}