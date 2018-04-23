package com.act.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(id="txtUsername") WebElement txt;
	@FindBy(id="txtPassword") WebElement pass;
	@FindBy(id="btnLogin") WebElement btn;
	
	public void login()
	{
		txt.sendKeys("admin");
		pass.sendKeys("admin");
	}
	

}
