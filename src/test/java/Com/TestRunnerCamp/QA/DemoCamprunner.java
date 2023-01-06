package Com.TestRunnerCamp.QA;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Com.Utility.QA.BaseCamp;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/CampResources/DemoCamp.features" },
                 plugin = { "json:target/cucumber.json" },
                 glue = "StepDepCamp")//, tags = { "@contact" })


public class DemoCamprunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void start() {
		BaseCamp run = new BaseCamp();
		run.initbrowser();
	}

	@AfterTest
	public void close() {
		BaseCamp run = new BaseCamp();
		run.driver.quit();
	}

}
