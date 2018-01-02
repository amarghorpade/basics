package com.scp.Immutable;

/*
 * Immutable class with immutable fields
 */

public class ImmutableDemoWithImmutableFields 
{

	public static void main(String[] args) 
	{
		Student st= new Student(1, "Amar Ghorpade");
		System.out.println(st);
	}

}


final class Student
{
	private final int id;
	private final String name;
	
	Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}