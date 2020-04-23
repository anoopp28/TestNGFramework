package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
	    int i = 9/0;
	}
	
	
	
	@Test(dependsOnMethods = "loginTest")    //dependsOnMethods
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}
	
	
	@Test
	public void SearchTest() {
		System.out.println("SearchTest");
	}

	
}
