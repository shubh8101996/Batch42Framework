package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbtn;
	
	@FindBy(id="RememberMe")
	private WebElement checkBox;
	
	
	public LoginPageClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void emailClear() {
		
		email.clear();
	}
	
     public void passwordClear() {
		
		password.clear();
	}
     
	
	public void enterCred(String email1,String password1) {
		
		email.sendKeys(email1);
		password.sendKeys(password1);
		
	}
	
	public void clickLogbtn() {
		
		loginbtn.click();
	}
	

}
