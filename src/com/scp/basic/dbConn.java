package com.scp.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConn
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","oracle");
		Statement st= con.createStatement();
		String query=("select * from login");
		System.out.println("Record Inserted successfully....!!");
		
		//ResultSet rs=st.executeQuery(query);
		/**
		 * 
		 * When we are updating record than ResultSet not required..
		 * 
		 * ResultSet is only used to fetch the data.
		 * 
		 */
		//to insert, delete and update
		st.executeUpdate("insert into login values"+"('system', 'oracle')");
		//st.executeUpdate("delete from login where username='system'");
		
		/*while (rs.next())
		{
			//System.out.println("********************************8888");
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		rs.close();*/
		st.close();
		con.close();
	}
}
