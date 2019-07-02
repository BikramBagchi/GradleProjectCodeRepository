package com.orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage

{

	WebDriver driver ;
	
	@FindBy(xpath ="//input[@title=\"Search\"]")
	
	WebElement Search;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void senkeys()
	{
		Search.sendKeys("Ram");
	}
}
