package com.ictld.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictld.logins.Admin;
import com.ictld.logins.Pofficer;
import com.ictld.logins.TrainerHead;

public class TestldMain extends BaseTestld{

	TrainerHead trnObj;
	Pofficer 	pfObj;
	Admin		admObj;
	
	
	@Test(priority=1)
	public void TC_LP_01()
	{
		WebElement home=driver.findElement(By.xpath("//p[@class='fw-light fs-3']"));
		String act=home.getText();
		String exp=act;
		Assert.assertEquals(act, exp);
		System.out.println("Navigated to homepage");
	
	}
	
	
	@Test(priority=2)
	public void TC_TH_01 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.Username("trainer");
		trnObj.Password("trainer@123");
		trnObj.Login();
		WebElement print=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		String actual=print.getText();
		String exp="LearnerTracker";
		Assert.assertEquals(actual, exp);
		System.out.println("Navigated to learner dashboard as Trainer Head");
		trnObj.LogoutDrop();
		Thread.sleep(3000);
		trnObj.Logout();
	 
	}	
	
	@Test(priority=3)
	public void TC_TH_02 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.Username("trner");
		trnObj.Password("trainer@123");
		trnObj.Login();	
		WebElement print=driver.findElement(By.xpath("//div[@role='alert']"));
		String actual=print.getText();
		String exp="User not found !!";
		Assert.assertEquals(actual, exp);
		System.out.println("Enter correct details");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}	
	
	
	@Test(priority=4)
	public void TC_TH_03 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.Username("");
		trnObj.Password("");
		trnObj.Login();	
		WebElement print=driver.findElement(By.xpath("//small[@class='text-danger']//following::small[2]"));
		String actual=print.getText();
		String exp="Please fill in all fields.";
		Assert.assertEquals(actual, exp);
		System.out.println("Enter correct details");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void TC_LD_01 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.Username("trainer");
		trnObj.Password("trainer@123");
		trnObj.Login();
		trnObj.Add();
	}	
	
	@Test(priority=6)
	public void TC_LD_02 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.LearnerID("ST07");
		trnObj.Name("Adithya");
		trnObj.Course();
		trnObj.Submit();
		trnObj.Popup();
		Thread.sleep(3000);
	}	
	
	@Test(priority=7)
	public void TC_LD_03 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.Edit();
		trnObj.Course();
		trnObj.Submit();
		trnObj.Delete();
		Thread.sleep(3000);
	}	
	
	@Test(priority=8)
	public void TC_LD_04 () throws InterruptedException
	{
		trnObj=new TrainerHead(driver);
		trnObj.LogoutDrop();
		trnObj.Logout();
	}
	
	
	@Test(priority=9)
	public void TC_PO_01 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Username("pofficer");
		pfObj.Password("pofficer@123");
		pfObj.Login();
		WebElement print=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		String actual=print.getText();
		String exp="LearnerTracker";
		Assert.assertEquals(actual, exp);
		System.out.println("Navigated to learner dashboard as Placement Officer");
		pfObj.LogoutDrop();
		Thread.sleep(3000);
		pfObj.Logout();
	}
	
	@Test(priority=10)
	public void TC_PO_02 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Username("poffic");
		pfObj.Password("pofficer@123");
		pfObj.Login();	
		WebElement print=driver.findElement(By.xpath("//div[@role='alert']"));
		String actual=print.getText();
		String exp="User not found !!";
		Assert.assertEquals(actual, exp);
		System.out.println("Enter correct details");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	@Test(priority=11)
	public void TC_PO_03 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Username("");
		pfObj.Password("");
		pfObj.Login();
		WebElement print=driver.findElement(By.xpath("//small[@class='text-danger']//following::small[2]"));
		String actual=print.getText();
		String exp="Please fill in all fields.";
		Assert.assertEquals(actual, exp);
		System.out.println("Enter correct details");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	@Test(priority=12)
	public void TC_LDP_01 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Username("pofficer");
		pfObj.Password("pofficer@123");
		pfObj.Login();
		pfObj.Update();
	}
	
	@Test(priority=13)
	public void TC_LDP_02 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Pstatus();
		pfObj.Submit();
		WebElement print=driver.findElement(By.xpath("//td[7]"));
		String actual=print.getText();
		String exp="Placed";
		Assert.assertEquals(actual, exp);
		System.out.println("Placement Status changed to 'Placed'");
	}
	
	@Test(priority=14)
	public void TC_LDP_03 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Update();
		pfObj.Pstatus2();
		pfObj.Submit();
		WebElement print=driver.findElement(By.xpath("//td[7]"));
		String actual=print.getText();
		String exp="Job seeking";
		Assert.assertEquals(actual, exp);
		System.out.println("Placement Status changed to 'Jobseeking'");
	}
	
	@Test(priority=15)
	public void TC_LDP_04 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.Update();
		pfObj.Pstatus3();
		pfObj.Submit();
		WebElement print=driver.findElement(By.xpath("//td[7]"));
		String actual=print.getText();
		String exp="Not Interested";
		Assert.assertEquals(actual, exp);
		System.out.println("Placement Status changed to 'Not Interested'");
		
	}
	
	@Test(priority=16)
	public void TC_LDP_05 () throws InterruptedException
	{
		pfObj=new Pofficer(driver);
		pfObj.LogoutDrop();	
		pfObj.Logout();
	}
	
	@Test(priority=17)
	public void TC_AA_01 () throws InterruptedException
	{
		admObj=new Admin(driver);
		admObj.Username("admin");
		admObj.Password("admin@123");
		admObj.Login();
		WebElement print=driver.findElement(By.xpath("//div[@role='alert']"));
		String actual=print.getText();
		String exp="Login Failed!!";
		Assert.assertEquals(actual, exp);
		System.out.println("Admin access denied");
		driver.navigate().refresh();
	}
}
