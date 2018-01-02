package com.scp.clonable;

import java.util.Date;

public class DeepCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		AddressDeep adrd1= new AddressDeep("Sangli", 416416);
		Date date= new Date();
		EmployeeDeep empd1= new EmployeeDeep(1, "Amar Ghorpade", adrd1,date);
		System.out.println(empd1);
		EmployeeDeep empd2=(EmployeeDeep) empd1.clone();
		System.out.println(empd2);
		System.out.println(empd1==empd2);//false
		System.out.println("address compsrison:"+(empd1.address==empd2.address));
		empd2.address.city="Mumbai";
		System.out.println("Date cloaninig-- "+(empd1.date==empd2.date));
		empd1.date.setDate(2);
		System.out.println("Date afer dfsgdfhcloaninig-- "+(empd1.date==empd2.date));
		System.out.println(empd1.address==empd2.address);
		
		System.out.println(empd1.address);//sangli
		System.out.println(empd2.address);//mumbai
		
	}

}

class EmployeeDeep implements Cloneable {
	int id;
	String name;
	AddressDeep address;
	Date date;

	

	public EmployeeDeep(int id, String name, AddressDeep address, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDeep [id=" + id + ", name=" + name + ", address="
				+ address + ", date=" + date + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		EmployeeDeep ed = (EmployeeDeep) super.clone();
		 ed.date =  (Date) ed.date.clone(); 
		 return ed; 
		 
		 
		 
		/* c
		
		
		
		
		
		EmployeeDeep clonned=(EmployeeDeep) super.clone();
		clonned.address=  (AddressDeep) clonned.address.clone();

		AddressDeep ad1= new AddressDeep(address.city, address.pincode);
		EmployeeDeep emp1= new EmployeeDeep(id, name, ad1, date);*/
		
	}
}

class AddressDeep 
implements Cloneable 
{
	String city;
	int pincode;

	public AddressDeep(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() 
	{
		return "AddressDeep [city=" + city + ", pincode=" + pincode + "]";
	}
	
	/*@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Object ob= (Date)super.clone();
		return ;
	}*/
}