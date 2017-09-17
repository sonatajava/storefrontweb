package com.sonata.storefront.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Integer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.storefront.dao.InsertDAO;
import com.sonata.storefront.dao.impl.InsertDAOImpl;
import com.sonata.storefront.model.Address;
import com.sonata.storefront.model.Customer;
import com.sonata.storefront.service.Validate;

/**
 * Servlet implementation class CustomerBeanServlet
 */
@WebServlet("/CustomerBeanServlet")
public class CustomerBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerBeanServlet() {
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
		
		InsertDAO iDAO1 = new InsertDAOImpl();
		Customer c=new Customer();
		Address a=new Address();
		Validate v1=new Validate();
		boolean b=false;
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		c.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
		c.setName(request.getParameter("name"));
		c.setUserName(request.getParameter("username"));
		c.setPassword(request.getParameter("password"));
		c.setSecurityQuestion(request.getParameter("securityQuestion"));
		c.setAnswer(request.getParameter("answer"));
		c.setEmail(request.getParameter("email"));
		c.setMobileNo(request.getParameter("mobile"));
		c.setGender(request.getParameter("gender"));
		c.setDateOfBirth(request.getParameter("dateOfBirth"));
		b=v1.validate(request.getParameter("password"));
		
		
		a.setAddress_id(Integer.parseInt(request.getParameter("addressId")));
		a.setDno(request.getParameter("dno"));
		a.setStreet(request.getParameter("street"));
	    a.setCity(request.getParameter("city"));
		a.setDistrict(request.getParameter("district"));
		a.setPinCode(Integer.parseInt(request.getParameter("pincode")));
		a.setState(request.getParameter("state"));
		
       
		try{
			
		    if(b)
		    {
			iDAO1.insertCustomer(c,a);
		     //throw new SQLException();
		    }
		    else{
		    	out.println("Enter valid password");
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
