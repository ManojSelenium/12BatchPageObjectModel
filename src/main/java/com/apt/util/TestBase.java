package com.apt.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements SetUp{

	WebDriver driver;
	
	public WebDriver launchBrowser() {
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Test Base Driver : "+driver);
		return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
}
