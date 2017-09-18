package com.sonata.storefront.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class ChangeBeanServlet
 */
@WebServlet("/ChangeBeanServlet")
public class ChangeBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeBeanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginDAO l1DAO = new LoginDAOImpl();
		boolean b=false;
		PrintWriter out=response.getWriter();
		Login l2 = new Login();
		String pwd1=request.getParameter("pwd1");
		String pwd2=request.getParameter("pwd2");
		if(pwd1.equals(pwd2))
		{	
			
		l2.setUserName(request.getParameter("user"));
		l2.setPassword(request.getParameter("old"));
		System.out.println("password:"+request.getParameter("old"));
		b=l1DAO.login(l2);
		if(b)
		{	
		    l2.setPassword(request.getParameter("pwd1"));
			l1DAO.change(l2);
			RequestDispatcher disp2=request.getRequestDispatcher("/WEB-INF/views/login.jsp");
			disp2.forward(request, response);
		}
		else{
			out.println("Invalid password");
		}
		}
		else
		{
			out.println("passwords are not matching");
		}
	}

}
