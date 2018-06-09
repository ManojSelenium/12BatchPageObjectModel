package com.apt.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	WebDriver driver;

	public WebElements(WebDriver driver) {
		this.driver=driver;
	}

	public void click(By prop) {
		driver.findElement(prop).click();
	}
	public void enterText(By prop,String testData) {
		driver.findElement(prop).clear();
		driver.findElement(prop).sendKeys(testData);	
	}

	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}
	
	public Select selectValueFromDropDown(By prop) {
		return new Select(driver.findElement(prop));
	}
	
	
}
