package com.orange.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.pages.LoginPage;

public class LoginPageTest
{

	WebDriver driver ;
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	


	}
	
	@Test
	public void test23()
	{
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.senkeys();
		
		System.out.println("random");
	}
}
