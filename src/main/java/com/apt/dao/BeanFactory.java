package com.apt.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {


	public void createNewUserData(CreateUserBean bean) {


		bean.setEmailAddress(RandomStringUtils.randomAlphabetic(6)+"@mailinator.com");
		bean.setFirstName(RandomStringUtils.randomAlphabetic(6));
		bean.setLastName(RandomStringUtils.randomAlphabetic(6));

		bean.setPassword("Password@123");

		bean.setDay("12");
		bean.setMonth("6");
		bean.setYear("1989");

		bean.setAddress(RandomStringUtils.randomAlphabetic(5));
		bean.setCity(RandomStringUtils.randomAlphabetic(6));
		bean.setState("5");
		bean.setZipcode("12345");
		bean.setPhoneNumber(RandomStringUtils.randomNumeric(10));
		bean.setAlias(RandomStringUtils.randomAlphabetic(6));
	}
	
	public void editUser(EditUserBean bean) {
		
		bean.setFirstName("Manoj");
		bean.setLastName("Manoj");
		bean.setCurrentPassword("Password@123");
		bean.setNewPassword("Selenium@123");
		bean.setConfirmPassword("Selenium@123");
		
	}
}
