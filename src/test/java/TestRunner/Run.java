package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {".//Feature/Login.feature",".//Feature/RegisteruserandSearch.feature"},
    glue = "com.stepdefinition.practice",
    dryRun=true,
	monochrome=true,
	plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
public class Run{}
