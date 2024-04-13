package com.ictld.logins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {

	WebDriver driver;
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement login;
	
	
	public Admin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Username(String mail)
	{
		username.sendKeys(mail);
	}
	
	public void Password(String pword)
	{
		password.sendKeys(pword);
	}
	
	public void Login()
	{
		login.click();
	}
}
