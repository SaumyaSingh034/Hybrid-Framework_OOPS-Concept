package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTestClass{
	
	//Page Locators
	private By username = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By loginBtn = By.id("btnLogin");
	private By forgetPasswd  = By.xpath("//*[text()='Forgot your password?']");
	private By companyLogo = By.xpath("//img[contains(@src,'/webres_6051af48107ce6.31500353/')]");

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

}
