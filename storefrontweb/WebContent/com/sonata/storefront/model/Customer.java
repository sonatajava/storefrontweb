/*
 * @(#)Customer.java
 * Copyright (c) Sonata-software
 */

package com.sonata.storefront.model;

import java.sql.Date;

public class Customer {
	private int customerId;

	private String name;

	private String password;

	private String securityQuestion;

	private String answer;

	private String userName;

	private String email;

	private String gender;

	private String mobileNo;

	private String dateOfBirth;

	public Customer()
	{
		customerId=0;
		name=null;
		password=null;
		securityQuestion=null;
		answer=null;
		userName=null;
		email=null;
		gender=null;
		mobileNo=null;
		dateOfBirth=null;
	}
	// Method for getting userName
	public String getUserName() {
		return userName;
	}
    
	
	// Method for setting userName
	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Method for getting email
	public String getEmail() {
		return email;
	}
	
	
	// Method for setting email
	public void setEmail(String email) {
		this.email = email;
	}

	
	// Method for getting gender
	public String getGender() {
		return gender;
	}
	
	
	// Method for setting gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	// Method for getting mobileNo
	public String getMobileNo() {
		return mobileNo;
	}
	
	
	// Method for setting mobileNo
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	// Method for getting customerId
	public int getCustomerId() {
		return customerId;
	}
	
	
	// Method for setting customerId
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	// Method for getting name
	public String getName() {
		return name;
	}
	
	
	// Method for setting name
	public void setName(String name) {
		this.name = name;
	}

	
	// Method for getting password
	public String getPassword() {
		return password;
	}
	
	
	// Method for setting password
	public void setPassword(String password) {
		this.password = password;
	}

	
	// Method for getting securityQuestion
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	
	// Method for setting securityQuestion
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	
	// Method for getting answer
	public String getAnswer() {
		return answer;
	}
	
	
	// Method for setting answer
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	// Method for getting dateOfBirth
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	
	// Method for setting dateOfBirth
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
