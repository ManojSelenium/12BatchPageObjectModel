package com.atp.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apt.dao.BeanFactory;
import com.apt.dao.CreateUserBean;
import com.apt.dao.EditUserBean;
import com.apt.pages.CreateAccountPage;
import com.apt.pages.EditAccountPage;
import com.apt.pages.LandingPage;
import com.apt.pages.LoginPage;
import com.apt.pages.MyAccountPage;
import com.apt.util.TestBase;

public class R234_Edit_Account extends TestBase{

	LandingPage landingPage;
	LoginPage loginPage;
	CreateAccountPage createAccountPage;
	MyAccountPage  myAccountPage;
	EditAccountPage editAccountPage;
	@BeforeMethod
	public void setUp() {
		WebDriver driver=launchBrowser();
		enterURL("http://automationpractice.com/index.php");
		
		landingPage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		createAccountPage=new  CreateAccountPage(driver);
		myAccountPage=new MyAccountPage(driver);
		editAccountPage=new EditAccountPage(driver);  
				
	}
	
	
	@Test
	public void tc_2() {
		landingPage.clickSignin();
		
		CreateUserBean bean=new CreateUserBean();
		BeanFactory factory=new BeanFactory();
		factory.createNewUserData(bean);
		loginPage.enterEmailAddress(bean);
		loginPage.clickCreateAccountButton();
		
		createAccountPage.createNewUser(bean);
		createAccountPage.clickRegister();
		
		myAccountPage.clickPersonalInfo();
		
		EditUserBean editUserBean=new EditUserBean();
		factory.editUser(editUserBean);
		editAccountPage.editUser(editUserBean);
		
		editAccountPage.clickSave();
		
	}
	
}
