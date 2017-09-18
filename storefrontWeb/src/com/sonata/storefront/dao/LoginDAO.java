package com.sonata.storefront.dao;

import com.sonata.storefront.model.Login;

public interface LoginDAO {
	public boolean login(Login l);
	public void lock(Login l);
	public void change(Login l);
	public boolean forgot(Login l,String answer);

}
