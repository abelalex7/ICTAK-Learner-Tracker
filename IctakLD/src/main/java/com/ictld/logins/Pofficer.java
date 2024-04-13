package com.ictld.logins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pofficer {

	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement login;
	@FindBy(xpath="//a[@id='basic-nav-dropdown']")
	private WebElement logoutdown;
	@FindBy(xpath="//a[@role='button'][2]")
	private WebElement logout;
	@FindBy(xpath="//div[@class='table-responsive']//following::button[1]")
	private WebElement update;
	@FindBy(xpath="//select[@name='pstatus']")
	private WebElement pstat;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement sbmit;
	
	
	public Pofficer(WebDriver driver)
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
	public void LogoutDrop()
	{
		logoutdown.click();
	}
	public void Logout()
	{
		logout.click();
	}
	public void Update()
	{
		update.click();
	}
	public void Pstatus()
	{
		Select select =new Select(pstat);
		select.selectByValue("Placed");
	}
	
	public void Pstatus2()
	{
		Select select =new Select(pstat);
		select.selectByValue("Job seeking");
	}
	
	public void Pstatus3()
	{
		Select select =new Select(pstat);
		select.selectByValue("Not Interested");
	}
	
	
	public void Submit()
	{
		sbmit.click();
	}

}
