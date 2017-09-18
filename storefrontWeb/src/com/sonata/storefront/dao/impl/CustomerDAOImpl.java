package com.sonata.storefront.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sonata.storefront.dao.CustomerDAO;
import com.sonata.storefront.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		Connection con = new DBConnectionImpl().getDBConnection();
		try {
			PreparedStatement pst = con
					.prepareStatement("select * from customer");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt("customer_id"));
				customer.setName(rs.getString("name"));
				customer.setUserName(rs.getString("user_name"));
				customer.setPassword(rs.getString("password"));
				customer.setSecurityQuestion(rs.getString("security_question"));
				customer.setAnswer(rs.getString("answer"));
				
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customerList;
	}

}
