package com.TestClass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.LoginPageClass;
import com.Uitility.ExtendReportClass;
import com.Uitility.Xls_Reader;

@Listeners(ExtendReportClass.class)
public class TestCaseNo1_Login extends BaseClass {

	@Test
	public void login() throws InterruptedException {

//		Xls_Reader read=new Xls_Reader("C:\\Users\\shubh\\eclipse-workspace\\Batch42Framework\\src\\test\\resources\\testdata.xlsx");
//		
//		String username=read.getCellData("Sheet1", 0, 2);
//		String password=read.getCellData("Sheet1", 1,2);
//		
//		System.out.println(username);
//		System.out.println(password);
		
		
		driver.get(mainUrl);
		LoginPageClass lp = new LoginPageClass(driver);
		lp.emailClear();
		lp.passwordClear();
//		Assert.assertTrue(false);
		lp.enterCred(mainUsername, mainPass);
		Thread.sleep(4000);
		lp.clickLogbtn();

	}

}
