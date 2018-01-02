package com.scp.basic;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet 
{
	public static void main(String[] args) 
	{
		Employee e1= new Employee(101,"Amar Ghorpade",2000);
		Employee e2= new Employee(102,"Abhijeet Ghorpade",4000);
		Employee e3= new Employee(101,"Sagar Naik",9000);
		Employee e4= new Employee(103,"Ashwini Suryavanshi",10000);
		Employee e5=e2;
		Set<Employee> s= new HashSet<Employee>();
		System.out.println(s.add(e1));
		System.out.println(s.add(e2));
		System.out.println(s.add(e3));
		System.out.println(s.add(e4));
		System.out.println(s.add(e5));
		System.out.println("Added successfully");
		Iterator<Employee> it= s.iterator();
		
		System.out.println(s);
		System.out.println("*********************************************************");
		while(it.hasNext())
		{
			Employee e =(Employee)it.next();
			System.out.println("@@@@@@@@@@@@@@"+e);
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
			
		}	
	}
	
}

class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	*/
}

/*both ovrride
 true
true
false
true
false
Added successfully
102  Abhijeet Ghorpade  4000
101  Amar Ghorpade  2000
103  Ashwini Suryavanshi  10000

Only Hashcode override
true
true
true
true
false
Added successfully
102  Abhijeet Ghorpade  4000
101  Sagar Naik  9000
101  Amar Ghorpade  2000
103  Ashwini Suryavanshi  10000

only equals override
true
true
true
true
false
Added successfully
102  Abhijeet Ghorpade  4000
101  Amar Ghorpade  2000
103  Ashwini Suryavanshi  10000
101  Sagar Naik  9000

Both not override
true
true
true
true
false
Added successfully
102  Abhijeet Ghorpade  4000
101  Amar Ghorpade  2000
103  Ashwini Suryavanshi  10000
101  Sagar Naik  9000
 * 
 * */