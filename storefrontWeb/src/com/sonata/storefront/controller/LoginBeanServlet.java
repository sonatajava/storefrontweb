package com.sonata.storefront.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.storefront.dao.LoginDAO;
import com.sonata.storefront.dao.impl.LoginDAOImpl;
import com.sonata.storefront.model.Login;

/**
 * Servlet implementation class LoginBeanServlet
 */
@WebServlet("/LoginBeanServlet")
public class LoginBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginBeanServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginDAO l1DAO = new LoginDAOImpl();
		Login l1 = new Login();
		RequestDispatcher disp2 = request
				.getRequestDispatcher("/WEB-INF/views/login.jsp");
		RequestDispatcher disp3 = request
				.getRequestDispatcher("/WEB-INF/views/reLogin1.jsp");
		boolean b;

		l1.setUserName(request.getParameter("user"));
		l1.setPassword(request.getParameter("password"));
		b = l1DAO.login(l1);
		System.out.println("IN LOgin bean" + b);
		if (b) {
			System.out.println("true");
			count = 0;

		} else {
			count += 1;
			System.out.println(count);
			System.out.println("false");
			disp2.forward(request, response);
			if (count == 3) {
				l1DAO.lock(l1);
				disp3.forward(request, response);

			}
		}

	}

}
