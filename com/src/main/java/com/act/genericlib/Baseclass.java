package com.act.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.act.objrepo.Loginpage;

public class Baseclass {
	public WebDriver driver;
	Property p=new Property();
	static
	{
		System.setProperty("webdriver.chrome.driver","//home//tyss//Desktop//soumya//com//src//test//resources//chromedriver");
	}
	@BeforeClass
	public void BCconfig() throws Throwable
	{
		Properties pro=p.getproperties();
		//driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","//home//tyss//Desktop//soumya//com//src//test//resources//chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url=pro.getProperty("url");
		driver.get(url);
	
		
	}
	@BeforeMethod
	public void BMconfig()
	{
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		lp.login();
	
	}
	@AfterMethod
	public void AMconfig()
	{
		
	}
	
	@AfterClass
	public void ACconfig()
	{
		
		
	}
	

	
}
