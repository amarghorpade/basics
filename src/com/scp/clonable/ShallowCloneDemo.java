package com.scp.clonable;

/*
 * Outer object cloned inner not clone
 * Emploee cloned but address not clone
 * 
 * need to implement clonable marrker interface
 * 
 * need to override clone method and in that call super class clone method
 * 
 * 
 * 
 * 
 */

public class ShallowCloneDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException
	{	
		Address ad1= new Address(411046, "Pune");
		Employee emp1= new Employee(1, "Amar Ghorpade", ad1);
		System.out.println(emp1);
		Employee emp2=(Employee) emp1.clone();
		emp2.address.city="Mumbai";
		//emp2.empId=20;
		System.out.println(emp2);
		System.out.println(emp1==emp2);
		System.out.println(emp1.address.city==emp2.address.city);
		System.out.println(emp1.address.city);
		System.out.println(emp2.address.city);
	}	
}

class Employee implements Cloneable{
	int empId;
	String empName;
	Address address;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
public Employee(int empId, String empName, Address address) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
/*public  Object abc() throws CloneNotSupportedException
{
	return super.clone();
}
*//* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", address="
			+ address + "]";
}



}

class Address {
	int pin;
	String city;
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	
}