package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDefinitions",
		plugin = { "html:target.html",
		"json:target.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		dryRun = false,
		monochrome = true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
