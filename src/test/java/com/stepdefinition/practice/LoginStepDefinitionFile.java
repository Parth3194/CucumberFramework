package com.stepdefinition.practice;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pageobjectmodel.practice.LoginPOM;
import com.utilities.practice.ReadConfigurationFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionFile extends TestBase {
	
	
	
@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() throws IOException {
		
		config = new ReadConfigurationFile();
		String browser = config.getBrowser();
		switch(browser) {
		case "chrome" :
			driver = new ChromeDriver();
			break;
			
		case "edge" :
			driver = new EdgeDriver();
			break;
		case "firefox" :
			break;
		}	
		lpom = new LoginPOM(driver);
		}
	@When("User opens the url as {string}")
	public void user_opens_the_url_as(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("enters the username as {string} and password as {string}")
	public void enters_the_username_as_and_password_as(String username, String password) {
	 lpom.EnteringLoginData(username, password);
	}


	@When("click on login button")
	public void click_on_login_button() {
	lpom.performlogin();
	}

	@Then("User is successfully logged in the application and views the landing page")
	public void user_is_successfully_logged_in_the_application_and_views_the_landing_page() {
	lpom.verification();
	}

}
