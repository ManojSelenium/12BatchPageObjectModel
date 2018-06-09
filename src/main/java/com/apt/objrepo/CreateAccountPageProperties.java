package com.apt.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountPageProperties {


	By FIRSTNAME=By.id("customer_firstname");
	By LASTNAME=By.id("customer_lastname");
	By PASSOWRD=By.id("passwd");
	By DAY=By.id("days");
	By MONTH=By.id("months");
	By YEARS=By.id("years");
	By ADDRESS=By.id("address1");
	By CITY=By.id("city");
	By STATE=By.id("id_state");
	By POSTALCODE=By.id("postcode");
	By MOBILENUMBER=By.id("phone_mobile");
	By ALIAS=By.id("alias");
	By REGISTER_BUTTON=By.id("submitAccount");
}
