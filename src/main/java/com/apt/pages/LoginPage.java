package com.apt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.apt.dao.CreateUserBean;
import com.apt.objrepo.LoginPageProperties;
import com.apt.util.WebElements;

public class LoginPage extends WebElements implements LoginPageProperties{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickCreateAccountButton() {
		click(CREATEACCOUNT_BUTTON);
	}

	public void enterEmailAddress(CreateUserBean bean) {
		enterText(EMAILADDRESS_LOCATOR,bean.getEmailAddress());
	}
}
