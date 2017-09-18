/*
 * @(#)Address.java
 * Copyright (c) Sonata-software
*/

package com.sonata.storefront.model;

public class Address {
	private int address_id;
	
	private String dno;
	
	private String street;
	
	private String city;
	
	private int pinCode;
	
	private String district;
	
	private String state;
	
	
	public Address()
	{
		address_id=0;
		dno=null;
		street=null;
		city=null;
		pinCode=00;
		district=null;
		state=null;
	}
	
	public int getAddress_id() {
		return address_id;
	}


	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}


	//Method for getting dno
	public String getDno() {
		return dno;
	}
	
	
	//Method for setting dno
	public void setDno(String dno) {
		this.dno = dno;
	}
	
	
	//Method for getting street
	public String getStreet() {
		return street;
	}
	
	
	//Method for setting street
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	//Method for getting city
	public String getCity() {
		return city;
	}
	
	
	//Method for setting city
	public void setCity(String city) {
		this.city = city;
	}
	
	
	//Method for getting pinCode
	public int getPinCode() {
		return pinCode;
	}
	
	
	//Method for setting pinCode
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	//Method for getting state
	public String getState() {
		return state;
	}
	
	//Method for setting state
	public void setState(String state) {
		this.state = state;
	}
	

}
