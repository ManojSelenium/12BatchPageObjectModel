package com.apt.objrepo;

import org.openqa.selenium.By;

public interface EditAccountPageProeprties {

	
	By FIRSTNAME=By.id("firstname");
	By LASTNAME=By.id("lastname");
	
	By CURRENTPASSWORD=By.id("old_passwd");
	
	By NEWPASSWORD=By.id("passwd");
	By CONFRIMPASSWORD=By.id("confirmation");
	
	By SAVEBUTTON=By.name("submitIdentity");
	
}
