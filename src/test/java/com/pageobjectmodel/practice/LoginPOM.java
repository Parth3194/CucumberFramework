package com.pageobjectmodel.practice;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	WebDriver driver;
	public LoginPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(linkText = "My Account")
	private WebElement myaccountDropdown;
	
	@FindBy(linkText = "Login")
	private WebElement Loginoption ;
	
	@FindBy(id = "input-email")
	private WebElement usernametextbox;
	
	@FindBy(id ="input-password")
	private WebElement passwordtextbox;
	
	@FindBy(xpath ="//input[@type='submit' and @value='Login']")
	private WebElement Loginbutton;
	
	@FindBy(linkText = "My Account")
	private WebElement account;
	
	public void EnteringLoginData(String username,String password) {
		myaccountDropdown.click();
		Loginoption.click();
		usernametextbox.sendKeys(username);
		passwordtextbox.sendKeys(password);
	}
	
	public void performlogin() {
	Loginbutton.click();
	}
	
	public void verification() {
		Assert.assertTrue(account.isDisplayed());
		driver.quit();
	}
}