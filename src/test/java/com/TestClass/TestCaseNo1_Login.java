package com.TestClass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.LoginPageClass;
import com.Uitility.ExtendReportClass;

@Listeners(ExtendReportClass.class)
public class TestCaseNo1_Login extends BaseClass {

	@Test
	public void login() {

		driver.get(mainUrl);
		LoginPageClass lp = new LoginPageClass(driver);
		lp.emailClear();
		lp.passwordClear();
		Assert.assertTrue(false);
		lp.enterCred(mainUsername, mainPass);
		lp.clickLogbtn();

	}

}
