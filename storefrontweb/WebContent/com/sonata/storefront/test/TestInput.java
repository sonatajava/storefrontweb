package com.sonata.storefront.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sonata.storefront.dao.InsertDAO;
import com.sonata.storefront.dao.impl.InsertDAOImpl;
import com.sonata.storefront.model.*;

public class TestInput {
	public static void main(String args[]) {
		InsertDAO iDAO = new InsertDAOImpl();
		Customer c1 = new Customer();
		Address a1 = new Address();
		c1.setCustomerId(234145);
		c1.setName("peter pan");
		c1.setUserName("parker$123");
		c1.setPassword("PetPan$26");
		c1.setSecurityQuestion(" your Favourite movie");
		c1.setAnswer("Rocky");
		c1.setEmail("peterpan@gmail.com");
		c1.setMobileNo("8097658769");
		c1.setGender("male");
		String date = "12-08-1992";
		/*SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		Date date2 = null;
		try {
			date2 = df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(date2.getTime());*/
		c1.setDateOfBirth(date);

		a1.setAddress_id(3452);
		a1.setDno("67/B/G");
		a1.setStreet("Richmond street");
		a1.setCity("Benguluru");
		a1.setDistrict("Benguluru Urban");
		a1.setPinCode(456324);
		a1.setState("Karnataka");
		iDAO.insertCustomer(c1, a1);
	}

}
