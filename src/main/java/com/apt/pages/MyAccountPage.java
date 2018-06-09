package com.apt.pages;

import org.openqa.selenium.WebDriver;

import com.apt.objrepo.MyAccountPageProperties;
import com.apt.util.WebElements;

public class MyAccountPage extends WebElements implements MyAccountPageProperties{

	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickPersonalInfo() {
		click(PERSONALINFO);
	}
	
	public String verifyWelcomeMsg() {
		return getText(WELCOMEMSG);
	}
}
