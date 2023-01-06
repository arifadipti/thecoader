package StepDepCamp;

import Com.ActionsCamp.QA.LoginPageActions;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_72 extends BaseCamp{

	
	LoginPageActions LoginPageActions_obj = new LoginPageActions();
	
	
	@When("^Enter a valid username$")
	public void enter_a_valid_username() throws Throwable {
		LoginPageActions_obj.validusername();
		Thread.sleep(2000);
	}

	@When("^Enter a valid password$")
	public void enter_a_valid_password() throws Throwable {
		LoginPageActions_obj.validpassword();
		Thread.sleep(2000);
	}

	@When("^Click the Login button$")
	public void click_the_Login_button() throws Throwable {
		LoginPageActions_obj.clicklogin();
		
		Thread.sleep(2000);
	}

	@Then("^Verify user can log in successfully$")
	public void verify_user_can_log_in_successfully() throws Throwable {
		ScreenshotsCamp.screenshot(driver,"userprofile");
		Thread.sleep(3000);
		
	}

	@When("^Enter an invalid username$")
	public void enter_an_invalid_username() throws Throwable {
		
		LoginPageActions_obj.invalidusername();
		Thread.sleep(3000);
	}

	@When("^Enter an invalid password$")
	public void enter_an_invalid_password() throws Throwable {
		LoginPageActions_obj.invalidpassword();
		Thread.sleep(3000);
	}

	@Then("^Verify user can not log in successfully$")
	public void verify_user_can_not_log_in_successfully() throws Throwable {
		LoginPageActions_obj.verifyunsuccessfullogIn();
		ScreenshotsCamp.screenshot(driver,"logunsuccessfulllogin");
		Thread.sleep(3000);
	}

}
