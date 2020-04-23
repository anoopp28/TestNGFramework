package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"url", "emailid", "password"})
	public void loginTestString( String url, String emailid, String password ){
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		
		driver.findElement(By.name("email")).sendKeys(emailid);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
	}
}
