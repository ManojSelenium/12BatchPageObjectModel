package com.apt.pages;


import org.openqa.selenium.WebDriver;

import com.apt.dao.CreateUserBean;
import com.apt.objrepo.CreateAccountPageProperties;
import com.apt.util.WebElements;

public class CreateAccountPage extends WebElements implements CreateAccountPageProperties{

	
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void enterFirstName(CreateUserBean bean) {
		enterText(FIRSTNAME, bean.getFirstName());
	}
	public void enterLastName(CreateUserBean bean) {
		enterText(LASTNAME, bean.getLastName());
	}
	public void enterPassword(CreateUserBean bean) {
		enterText(PASSOWRD, bean.getPassword());
	}

	public void selectDay(CreateUserBean bean) {
		selectValueFromDropDown(DAY).selectByValue(bean.getDay());
	}
	public void selectMonth(CreateUserBean bean) {
		selectValueFromDropDown(MONTH).selectByValue(bean.getMonth());
	}
	public void selectYear(CreateUserBean bean) {
		selectValueFromDropDown(YEARS).selectByValue(bean.getYear());
	}
	
	public void enterAddress(CreateUserBean bean) {
		enterText(ADDRESS, bean.getAddress());
	}
	public void enterCity(CreateUserBean bean) {
		enterText(CITY, bean.getCity());
	}
	
	public void selectState(CreateUserBean bean) {
		selectValueFromDropDown(STATE).selectByValue(bean.getState());
	}
	
	public void enterZIPCode(CreateUserBean bean) {
		enterText(POSTALCODE, bean.getZipcode());
	}
	public void enterMobileNumber(CreateUserBean bean) {
	enterText(MOBILENUMBER, bean.getPhoneNumber());	
	}
	
	public void enterAlias(CreateUserBean bean) {
		enterText(ALIAS, bean.getAlias());
	}
	public void clickRegister() {
		click(REGISTER_BUTTON); 
		
	}
	public void createNewUser(CreateUserBean bean) {
		enterFirstName(bean);
		enterLastName(bean);
		enterPassword(bean);
		
		selectDay(bean);
		selectMonth(bean);
		selectYear(bean);
		enterAddress(bean);
		enterCity(bean);
		selectState(bean);
		enterZIPCode(bean);
		enterMobileNumber(bean);
		enterAlias(bean);
		
	}
}
