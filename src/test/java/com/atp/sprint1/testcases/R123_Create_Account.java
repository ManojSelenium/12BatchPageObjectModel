package com.atp.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apt.dao.BeanFactory;
import com.apt.dao.CreateUserBean;
import com.apt.pages.CreateAccountPage;
import com.apt.pages.LandingPage;
import com.apt.pages.LoginPage;
import com.apt.pages.MyAccountPage;
import com.apt.util.TestBase;

public class R123_Create_Account extends TestBase{

	LandingPage landingPage;

	LoginPage loginPage;

	CreateAccountPage accountPage;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void setUp() {

		WebDriver driver=launchBrowser();
		System.out.println("Test Case DRIVER :"+driver);
		enterURL("http://automationpractice.com/index.php");

		landingPage=new LandingPage(driver);

		//loginPage=new LoginPage(driver);
		accountPage=new CreateAccountPage(driver);
		myAccountPage=new MyAccountPage(driver);
	}

	@Test
	public void tc_1() {
		CreateUserBean bean=new CreateUserBean();
		BeanFactory factory=new BeanFactory();
		factory.createNewUserData(bean);
		loginPage=landingPage.clickSignin();
		loginPage.enterEmailAddress(bean);
		loginPage.clickCreateAccountButton();
		accountPage.createNewUser(bean);
		accountPage.clickRegister();
		Assert.assertEquals(myAccountPage.verifyWelcomeMsg(), WELCOMEMSG_TEXT);
	}

	@AfterMethod
	public void closeBrowser(){

	}
}
