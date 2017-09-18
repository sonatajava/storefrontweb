package com.sonata.storefront.dao.impl;

import java.sql.*;

import com.sonata.storefront.dao.LoginDAO;
import com.sonata.storefront.model.Login;

public class LoginDAOImpl implements LoginDAO {

	
	boolean b;
	Connection con1 = new DBConnectionImpl().getDBConnection();
	public boolean login(Login l) {

		
		try {
			PreparedStatement ptmt = con1
					.prepareStatement("select password from customer where user_name=?");

			ptmt.setString(1, l.getUserName());

			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("password"));

				if (l.getPassword().equals(rs.getString("password"))) {
					System.out.println("Valid");
					 b=true;
				} else {
					System.out.println("Not Valid");
	
					b=false;
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	  return b;	
	}	
			
		public void lock(Login l1)
		{
			try{	
			  PreparedStatement ptmt1 = con1
						.prepareStatement("update customer set status='0' where user_name=? ");
				ptmt1.setString(1, l1.getUserName());
				ptmt1.executeUpdate();
				b=false;
			 }	
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void change(Login l2)
		{
			try
			{
				PreparedStatement ptmt2=con1.prepareStatement("update customer set password=? where user_name=?");
				ptmt2.setString(1, l2.getPassword());
				ptmt2.setString(2, l2.getUserName());
				ptmt2.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public boolean forgot(Login l3,String answer)
		{
			try{
				//System.out.println(l3.getUserName());
				PreparedStatement ptmt3 = con1
						.prepareStatement("select answer from customer where user_name=?");
				ptmt3.setString(1, l3.getUserName());
				ResultSet rs1=ptmt3.executeQuery();
				//System.out.println(answer);
				
				
				//System.out.println(rs1.getString("answer"));
				
				while(rs1.next())
				{	
					boolean b=answer.equals(rs1.getString("answer"));
				      if(b) 
				      {
				    	  System.out.println(answer);
				    	  System.out.println((rs1.getString("answer")));
				    	  
				      }
			    }
			}	
			catch(SQLException e2)
			{
				System.out.println(e2);
				e2.printStackTrace();
			}
			catch(Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
			}
			return b;
		}
   }	
			
		
	

