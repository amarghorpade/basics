package com.scp.Immutable;

import java.util.Date;

public class ImmutableDemoWithMutableFields 
{
	public static void main(String[] args) 
	{
		Emp emp=new Emp(101, "Sagar naik");

		Date date= new Date(2017, 11, 23);
		
		Stud stud= new Stud(1, "Amar Ghorpade", emp, date);
		System.out.println("before--- "+stud);
	
		date.setDate(15);
		emp.setEmpId(30);
		stud.getEmp().setEmpId(201);
		//stud.getDate().setDate(11);
		System.out.println("after--- "+stud);	
	}
}

final class Stud
{
	private final int id;
	private final String name;
	private final Emp emp;
	private final Date date;
	
	Stud(int id, String name, Emp emp, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.emp = new Emp(emp.getEmpId(),emp.getEmpName());
		this.date = new Date(date.getYear(), date.getMonth(), date.getDay());;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Emp getEmp() {
		//return emp;
		return new Emp(emp.getEmpId(),emp.getEmpName());
	}

	public Date getDate() 
	{
		return new Date(date.getYear(), date.getMonth(), date.getDay());
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", date="
				+ date + ", emp=" + emp + "]";
	}
}

class Emp
{
	private int empId;
	
	String empName;
	
	public Emp(int empId, String empName) 
	{
		this.empId = empId;
		this.empName = empName;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
 
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}		
}