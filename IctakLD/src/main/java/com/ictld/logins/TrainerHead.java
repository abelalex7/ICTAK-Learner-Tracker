package com.ictld.logins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TrainerHead {

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
	@FindBy(xpath="//div[@class='container w-75 mt-4 pt-4']//child::button[1]")
	private WebElement adduser;
	@FindBy(xpath="//input[@id='learnerid']")
	private WebElement lrnid;
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	@FindBy(xpath="//select[@class='form-select required'][1]")
	private WebElement course;
	@FindBy(xpath="//select[@name='project']")
	private WebElement prjct;
	@FindBy(xpath="//select[@name='batch']")
	private WebElement batch;
	@FindBy(xpath="//select[@name='cstatus']")
	private WebElement crstat;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement sbmit;
	@FindBy(xpath="//div[@class='swal2-actions']//following::button[1]")
	private WebElement pup;
	@FindBy(xpath="//button[@class='btn btn-success'][1]")
	private WebElement edit;
	@FindBy(xpath="//button[@class='btn btn-danger'][1]")
	private WebElement del;
	
	
	public TrainerHead(WebDriver driver)
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
	public void Add()
	{
		adduser.click();
	}
	
	public void LearnerID(String lid)
	{
		lrnid.sendKeys(lid);
	}
	
	public void Name(String nam)
	{
		name.sendKeys(nam);
	}
	
	public void Course()
	{
		Select select =new Select(course);
		select.selectByValue("ST");
		Select select1 =new Select(prjct);
		select1.selectByValue("ICTAK");
		Select select2 =new Select(batch);
		select2.selectByValue("Mar_23");
		Select select3 =new Select(crstat);
		select3.selectByValue("Qualified");
	}
	
	public void Submit()
	{
		sbmit.click();	
	}
	
	public void Popup()
	{
		pup.click();	
	}
	
	public void Edit()
	{
		edit.click();
	}
	
	public void Delete()
	{
		del.click();
	}
	
}
