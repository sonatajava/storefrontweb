package com.sonata.storefront.dao;

import com.sonata.storefront.model.Login;

public interface LoginDAO {
	public boolean login(Login l);
	public void lock(Login l);

}
