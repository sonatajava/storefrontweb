/*
 * @(#)Validate.java
 * Copyright (c) Sonata-software
 */

package com.sonata.storefront.service;

import java.util.regex.Pattern;

public class Validate {

	/*
	 * This method is for validating the password
	 * 
	 * @param password,This is the parameter for the function.
	 * 
	 * @return boolean, This return whether the password is valid or not
	 */
	public boolean validate(String password) {
		boolean flag = true;

		Pattern uppercase = Pattern.compile("[A-Z]");

		Pattern lowerCase = Pattern.compile("[a-z]");

		Pattern digit = Pattern.compile("[0-9]");

		Pattern special = Pattern.compile("[^a-zA-Z0-9]");

		if (password.length() < 8)
			flag = false;

		if (!uppercase.matcher(password).find())
			flag = false;

		if (!lowerCase.matcher(password).find())
			flag = false;

		if (!digit.matcher(password).find())
			flag = false;

		if (!special.matcher(password).find())
			flag = false;

		return flag;
	}
}
