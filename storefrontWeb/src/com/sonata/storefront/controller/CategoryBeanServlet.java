package com.sonata.storefront.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.storefront.dao.impl.CategoryDAOImpl;
import com.sonata.storefront.model.Category;

/**
 * Servlet implementation class CategoryBeanServlet
 */
@WebServlet("/CategoryBeanServlet")
public class CategoryBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CategoryDAOImpl cat = new CategoryDAOImpl();

	public CategoryBeanServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Category> cList = cat.getCategory();
		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i < cList.size(); i++) {
			String p2 = cList.get(i).getC_name();
			list1.add(p2);
		}
		// String p1 = prodList.get(0).getPname();
		System.out.println("Entered");
		//System.out.println(list1.get(0));
		//System.out.println(list1.get(1));

		request.setAttribute("catList", cList);

		request.getRequestDispatcher("home.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
