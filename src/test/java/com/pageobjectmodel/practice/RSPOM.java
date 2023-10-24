package com.pageobjectmodel.practice;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.practice.TestBase;

public class RSPOM extends TestBase {
WebDriver driver ;
	public RSPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "My Account")
	private WebElement myaccountDropdown;
	
	@FindBy (linkText = "Register")
    private WebElement Registerbutton;
	
	@FindBy(id = "input-firstname")
	private WebElement firstnametextbox;
	
	@FindBy(id = "input-lastname")
	private WebElement lastnameTextbox;
	
	@FindBy(id = "input-email")
	private WebElement Emailtextbox;
	
	@FindBy(id ="input-telephone")
	private WebElement Telephonetextbox;
	
	@FindBy(id = "input-password")
	private WebElement Passwordtextbox;
	 
    @FindBy(id = "input-confirm")
    private WebElement ConfirmPasswordtextbox;
   
    		
    @FindBy(xpath ="//input[@name='agree']")
    private WebElement Checkbox;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement Submitbutton;

    @FindBy(linkText = "My Account")
	private WebElement myaccountlink;
    
    @FindBy(linkText ="Logout")
	private WebElement Logoutlink;
    
    @FindBy(xpath ="//input[@name='search']")
    private WebElement Searchbox;
    
    @FindBy(linkText = "HP LP3065")
    private WebElement HP;
    
    public void logout() {
    	Logoutlink.click();
    }
    
    public void verification() {
    	Assert.assertTrue(myaccountlink.isDisplayed());
    }
    
    public void navigatetoregisterPage() {
    	myaccountDropdown.click();
    	Registerbutton.click();
    }


    public void enterdata(String firstname, String lastname, String email,String telephone, String password, String confirmpassword ) {
    	firstnametextbox.sendKeys(firstname);
    	lastnameTextbox.sendKeys(lastname);
    	Emailtextbox.sendKeys(email);
    	Telephonetextbox.sendKeys(telephone);
    	Passwordtextbox.sendKeys(password);
    	ConfirmPasswordtextbox.sendKeys(confirmpassword);
    }
    
    public void check() {
    	Checkbox.click();
    }
    
    public void submit() {
    	Submitbutton.click();
    }
    public void searchproduct(String product) {
    	Searchbox.sendKeys(product);
    	Searchbox.sendKeys(Keys.ENTER);
    }
    
    public void productverify() {
    	Assert.assertTrue(HP.isDisplayed());
    }
    
}





