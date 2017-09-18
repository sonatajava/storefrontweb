package com.sonata.storefront.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sonata.storefront.dao.DBConnection;

public class DBConnectionImpl implements DBConnection {

	@Override
	public Connection getDBConnection() {
		String url = "jdbc:mysql://localhost:3306/storefront";
		String user = "root";
		Connection con = null;

		// String pass = "admin@123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, "admin@123");
			
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		System.out.println("Exception occured in conncetion");
		System.out.println(e);
		}
		return con;
		
		
		
	}

}
