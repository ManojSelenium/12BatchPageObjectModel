package com.apt.pages;

import org.openqa.selenium.WebDriver;

import com.apt.dao.EditUserBean;
import com.apt.objrepo.EditAccountPageProeprties;
import com.apt.util.WebElements;

public class EditAccountPage extends WebElements implements EditAccountPageProeprties{

	WebDriver driver;
	
	public EditAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(EditUserBean bean) {
		enterText(FIRSTNAME, bean.getFirstName());
	}
	public void enterLastName(EditUserBean bean) {
		enterText(LASTNAME, bean.getLastName());
	}
	public void enterCurrentPassword(EditUserBean bean) {
		enterText(CURRENTPASSWORD, bean.getCurrentPassword());
	}
	public void enterNewPassword(EditUserBean bean) {
		enterText(NEWPASSWORD, bean.getNewPassword());
	}
	public void enterConfrimPassword(EditUserBean bean) {
		enterText(CONFRIMPASSWORD, bean.getConfirmPassword());
	}
	
	public void clickSave() {
		click(SAVEBUTTON);
	}
	
	public void editUser(EditUserBean bean) {
		enterFirstName(bean);
		enterLastName(bean);
		enterCurrentPassword(bean);
		enterNewPassword(bean);
		enterConfrimPassword(bean);
	}
	
}

