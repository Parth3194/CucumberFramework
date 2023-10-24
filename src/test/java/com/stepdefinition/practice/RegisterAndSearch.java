package com.stepdefinition.practice;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pageobjectmodel.practice.LoginPOM;
import com.pageobjectmodel.practice.RSPOM;
import com.utilities.practice.ReadConfigurationFile;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterAndSearch extends TestBase {
	@Given("user performs browser setup")
	public void user_performs_browser_setup() throws IOException {
		
		
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
			driver = new FirefoxDriver();
			break;
			
		}
		rs = new RSPOM (driver);
	}

	@When("user opens {string}")
	public void user_opens(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("navigate to Register page")
	public void navigate_to_register_page() {
	rs.navigatetoregisterPage();
	}

	@Then("user enters data for {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_enters_data_for(String firstname, String lastname, String email, String telephone, String password, String confirmpassword) {
	rs.enterdata(firstname, lastname, email, telephone, password, confirmpassword);
	}

	@Then("user agree to the privacy ploicy")
	public void user_agree_to_the_privacy_ploicy() {
	rs.check(); 
	}

	@Then("clicks on continue button")
	public void clicks_on_continue_button() {
    rs.submit();
	}

	@Then("regrestion process is completed successfully")
	public void regrestion_process_is_completed_successfully() {
	rs.verification();
	}

	@Then("user can user successfully logout")
	public void user_can_user_successfully_logout() {
	rs.logout();
	}
    
	@When("search the {string}")
	public void search_the(String product) {
	   rs.searchproduct(product);
	}
 
	@Then("product is displayed")
	public void product_is_displayed() {
	rs.productverify();
	}
	
	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}


}
