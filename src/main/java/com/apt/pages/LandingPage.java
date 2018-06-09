package com.apt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.apt.objrepo.LandingPageProperties;
import com.apt.util.WebElements;

public class LandingPage extends WebElements implements LandingPageProperties{

	WebDriver driver; //Class Level

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public LoginPage clickSignin() {
		
		click(SIGNIN_LOCATOR);
		return new LoginPage(driver);
	}
	
	public void clickContactUs() {

		click(By.xpath(""));
	}
	
}
