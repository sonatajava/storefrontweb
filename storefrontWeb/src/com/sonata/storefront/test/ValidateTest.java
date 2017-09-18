/*
 * @(#)ValidateTest.java
 * Copyright (c) Sonata-software
 */

package com.sonata.storefront.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sonata.storefront.service.Validate;

public class ValidateTest {

	static Validate v1 = new Validate();

	boolean b = true;

	@BeforeClass
	public static void myBeforeClassMethod() {
		System.out.println("Setting up Environment for Testing:");
	}

	@Test
	// valid password
	public void test() {
		b = v1.validate("Abcd@123");
		assertTrue("Valid password", b);

	}

	@Test
	// Invalid password, missing upper case,digit and special characters
	public void test1() {
		b = v1.validate("abcdefg");
		assertFalse("Upper case,Digits,Special Characters are missing", b);
	}

	@Test
	// Invalid password, missing special character
	public void test2() {
		b = v1.validate("AbcdeF12");
		assertFalse("Special character is misssing", b);
	}

	@Test
	// Invalid password,missing lower case letters
	public void test3() {
		b = v1.validate("ABCDE@123");
		assertFalse("Lower case letters are missing", b);
	}

	@Test
	// Invalid password, missing digits
	public void test4() {
		b = v1.validate("abcDef@gh");
		assertFalse("Digits are missing", b);
	}

	@Test
	// Invalid password, length is less than 8
	public void test5() {
		b = v1.validate("Abc@1");
		assertFalse("length<8", b);
	}

	@AfterClass
	public static void myAfterClass() {
		System.out.println("Clearing the Environment");
	}

}
