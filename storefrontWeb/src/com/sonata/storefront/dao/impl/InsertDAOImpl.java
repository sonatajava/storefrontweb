package com.sonata.storefront.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.storefront.dao.InsertDAO;
import com.sonata.storefront.model.*;
import com.sonata.storefront.service.Validate;

public class InsertDAOImpl implements InsertDAO {

	@Override
	public void insertCustomer(Customer c, Address a) {
        System.out.println("Welcome BEAN");
        System.out.println(c.getCustomerId());
        System.out.println(c.getName());
        System.out.println(c.getUserName());
        System.out.println(c.getPassword());
        System.out.println(c.getSecurityQuestion());
        System.out.println(c.getAnswer());
        System.out.println(c.getEmail());
        System.out.println(c.getMobileNo());
       
        System.out.println(c.getGender());
        System.out.println(c.getDateOfBirth());
       
       
		try{
        Connection con14 = new DBConnectionImpl().getDBConnection();
        Connection con15= new DBConnectionImpl().getDBConnection();
		System.out.println(con14);
		
		
		Validate v1 = new Validate();
		boolean b = false;
		PreparedStatement pst=null,pst1=null; 
	
			System.out.println("excecuting");
			System.out.println("excecuting");
			pst= con14.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, c.getCustomerId());
			
			pst.setString(2, c.getName());
			System.out.println("excecuting");
			pst.setString(3, c.getUserName());
			
			pst.setString(4, c.getPassword());
			
			pst.setString(5, c.getSecurityQuestion());
			pst.setString(6, c.getAnswer());
			
			pst.setString(7, c.getEmail());
			
			pst.setString(8, c.getMobileNo());
			pst.setString(9, c.getGender());
			pst.setString(10, c.getDateOfBirth());
			pst.setInt(11, 1);
			b = v1.validate(c.getPassword());
            System.out.println("exceuting");
			pst1 = con15
					.prepareStatement("insert into address values(?,?,?,?,?,?,?,?)");
			System.out.println(con15);
			System.out.println("exceuting");
			pst1.setInt(1, a.getAddress_id());
			pst1.setString(2, a.getDno());
			pst1.setString(3, a.getStreet());
			pst1.setString(4, a.getCity());
			pst1.setString(5, a.getDistrict());
			pst1.setInt(6, a.getPinCode());
			pst1.setString(7, a.getState());
			pst1.setInt(8, c.getCustomerId());
			if (b) {
				System.out.println("excecuting");
				int re=pst.executeUpdate();
			     int re2=pst1.executeUpdate();
				System.out.println(re);
				System.out.println(re2);
			}
			
			
			
		}
            
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		}
		
	}


