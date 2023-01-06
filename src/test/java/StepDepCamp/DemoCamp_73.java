package StepDepCamp;

import Com.ActionsCamp.QA.HomePageActionsCamp;
import Com.ActionsCamp.QA.SignUPPageActionsCamp;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_73 extends BaseCamp{

	
	HomePageActionsCamp HomePageActions_obj = new HomePageActionsCamp();
	SignUPPageActionsCamp SignUPPageActions_obj = new SignUPPageActionsCamp();
	
	@Then("^Verify the Username field on the Sign-up page$")
	public void verify_the_Username_field_on_the_Sign_up_page() throws Throwable {
		SignUPPageActions_obj.usernameverify();
		Thread.sleep(3000);
	}

	@When("^Empty username field$")
	public void empty_username_field() throws Throwable {
		SignUPPageActions_obj.username();
		Thread.sleep(3000);
	}

	@When("^Empty password field$")
	public void empty_password_field() throws Throwable {
		SignUPPageActions_obj.password();
		Thread.sleep(3000);
	}

	@When("^User click on the Signup button$")
	public void user_click_on_the_Signup_button() throws Throwable {
		SignUPPageActions_obj.signin();
		Thread.sleep(3000);
	}

	@Then("^Verify user can not Sign up$")
	public void verify_user_can_not_Sign_up() throws Throwable {
		SignUPPageActions_obj.verifyunsuccessfulsignin();
	    ScreenshotsCamp.screenshot(driver, "unsuccessfulsignup");
	}

}
