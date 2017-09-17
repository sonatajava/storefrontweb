package com.sonata.storefront.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.storefront.dao.ProductDAO;
import com.sonata.storefront.model.Customer;
import com.sonata.storefront.model.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public List<Product> getProduct() {
		List<Product> productList = new ArrayList<Product>();
		Connection con = new DBConnectionImpl().getDBConnection();
		try {
			PreparedStatement pst=con.prepareStatement("select * from product order by priority");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setPname(rs.getString("pname"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getDouble("price"));
				p.setBrand(rs.getString("brand"));
				p.setImage(rs.getString("image"));
				p.setSpecid(rs.getInt("specid"));
				p.setPriority(rs.getInt("priority"));
				productList.add(p);
				
		   }
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	
   return productList;
   
}
}	
