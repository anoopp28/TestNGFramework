package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgbasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup Chrome property");
		
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login Method");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Test the title");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout Method");
	}
	
	@AfterClass
	public void close() {
		System.out.println("close browser Method");
	}

	@AfterSuite
	public void generateReprot() {
		System.out.println("generate reprot");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("Delete All Cookies");
	}
	
}
