package com.sonata.storefront.test;

import com.sonata.storefront.dao.LoginDAO;
import com.sonata.storefront.dao.impl.LoginDAOImpl;
import com.sonata.storefront.model.Login;

public class TestLogin {
	public static void main(String args[]) {
		LoginDAO l1 = new LoginDAOImpl();
		Login l = new Login();
		l.setUserName("pvjraju26");
		l.setPassword("Raju@1235");
		l1.login(l);
		l.setUserName("pvjraju26");
		l.setPassword("Raju@12343");
		l1.login(l);
		l.setUserName("pvjraju26");
		l.setPassword("Raju@12323");
		l1.login(l);
	}

}
