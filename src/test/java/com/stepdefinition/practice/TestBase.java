package com.stepdefinition.practice;
import org.openqa.selenium.WebDriver;

import com.pageobjectmodel.practice.LoginPOM;
import com.pageobjectmodel.practice.RSPOM;
import com.utilities.practice.ReadConfigurationFile;

public class TestBase {

	public WebDriver driver;
	public LoginPOM lpom;
	public ReadConfigurationFile config;
	public RSPOM rs;
}
