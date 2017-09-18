package com.sonata.storefront.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sonata.storefront.dao.CategoryDAO;
import com.sonata.storefront.model.Category;


public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public List<Category> getCategory() {
		List<Category> catList = new ArrayList<Category>();
		Connection con = new DBConnectionImpl().getDBConnection();
		try {
			PreparedStatement pst = con
					.prepareStatement("select * from category");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Category cat = new Category();
				cat.setCategory_id(rs.getInt("category_id"));
				cat.setC_name(rs.getString("category_name"));
				cat.setC_description(rs.getString("category_description"));
				
				
				catList.add(cat);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return catList;
	}

}
