package com.sonata.storefront.test;

import java.util.List;

import com.sonata.storefront.dao.CustomerDAO;
import com.sonata.storefront.dao.impl.*;
import com.sonata.storefront.model.Customer;

public class Test {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImpl();
		List<Customer> customerList = dao.getCustomers();
		System.out.println(customerList.get(1).getCustomerId());
		System.out.println(customerList.get(1).getName());

	}

}
