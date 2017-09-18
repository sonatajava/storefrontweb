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
 * Servlet implementation class ForgotBeanServlet
 */
@WebServlet("/ForgotBeanServlet")
public class ForgotBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotBeanServlet() {
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
		Login l2=new Login();
		boolean b=false;
		String pwd1=request.getParameter("pwd1");
		String pwd2=request.getParameter("pwd2");
		if(pwd1.equals(pwd2))
		{	
		 l2.setUserName(request.getParameter("user"));
		 l2.setPassword(request.getParameter("pwd1"));
		 String answer=request.getParameter("answer");
		 
		 b=l1DAO.forgot(l2,answer);
		 System.out.println(b);
		 if(b)
		 {
	     l1DAO.change(l2);		 
		 RequestDispatcher disp2=request.getRequestDispatcher("/WEB-INF/views/login.jsp");
			disp2.forward(request, response);
	    }
		}

}
}
