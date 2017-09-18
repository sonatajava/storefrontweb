package com.sonata.storefront.dao;

import com.sonata.storefront.model.Customer;
import com.sonata.storefront.model.Address;

public interface InsertDAO {
   public void insertCustomer(Customer c,Address a);
  
}
