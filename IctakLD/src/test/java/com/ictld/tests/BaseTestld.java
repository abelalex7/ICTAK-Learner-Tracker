package com.ictld.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestld {
WebDriver driver;

	
	@BeforeTest
	
	public void testconfig()
	{
		driver= new ChromeDriver();
		driver.get("https://learnertracker.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void aftconfig()
	{
		System.out.println("This Test is done");
		driver.close();
	}
}
