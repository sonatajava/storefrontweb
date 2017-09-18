package com.sonata.storefront.test;

import java.util.List;

import com.sonata.storefront.dao.ProductDAO;
import com.sonata.storefront.dao.impl.ProductDAOImpl;
import com.sonata.storefront.model.Product;

public class TestProduct {
	public static void main(String args[])
	{
		ProductDAO p1=new ProductDAOImpl();
		List<Product> productList=p1.getProduct();
		System.out.println(productList.get(0).getPid());
		System.out.println(productList.get(0).getPname());
		System.out.println(productList.get(0).getDescription());
		System.out.println(productList.get(0).getPrice());
		System.out.println(productList.get(0).getBrand());
		System.out.println(productList.get(0).getImage());
		System.out.println(productList.get(0).getSpecid());
		System.out.println(productList.get(0).getPriority());
		System.out.println();
		System.out.println();
		System.out.println(productList.get(1).getPid());
		System.out.println(productList.get(1).getPname());
		System.out.println(productList.get(1).getDescription());
		System.out.println(productList.get(1).getPrice());
		System.out.println(productList.get(1).getBrand());
		System.out.println(productList.get(1).getImage());
		System.out.println(productList.get(1).getSpecid());
		System.out.println(productList.get(1).getPriority());
		
		
	}

}
