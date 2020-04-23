package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
	}
	
	@Test (groups = "Title")
	public void googleTitleTest() {
		System.out.println( driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		
		}
	
	@Test(priority =1, groups = "logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@title = 'To all teachers and childcare workers, thank you']")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	


}
