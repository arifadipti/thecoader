package StepDepCamp;

import Com.ActionsCamp.QA.AboutUsActionsCamp;
import Com.ActionsCamp.QA.CartPageActionsCamp;
import Com.ActionsCamp.QA.ContactPageActionsCamp;
import Com.ActionsCamp.QA.HomePageActionsCamp;
import Com.ActionsCamp.QA.LoginPageActions;
import Com.ActionsCamp.QA.ProfilePageActionsCamp;
import Com.ActionsCamp.QA.SignUPPageActionsCamp;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_71  extends BaseCamp{
	
	HomePageActionsCamp HomePageActions_obj = new HomePageActionsCamp();
	AboutUsActionsCamp AboutUsActions_obj = new AboutUsActionsCamp();
	CartPageActionsCamp CartPageActions_obj = new CartPageActionsCamp();
	ContactPageActionsCamp ContactPageActions_obj = new ContactPageActionsCamp();
	LoginPageActions LoginPageActions_obj = new LoginPageActions();
	ProfilePageActionsCamp ProfilePageActions_obj = new ProfilePageActionsCamp();
	SignUPPageActionsCamp SignUPPageActions_obj = new SignUPPageActionsCamp();
	


	@Given("^Launch the application<\"([^\"]*)\">$")
	public void launch_the_application(String URL) throws Throwable {
		launchURL("URL");
	}

	@When("^Click the Home link on the Home page$")
	public void click_the_Home_link_on_the_Home_page() throws Throwable {
		HomePageActions_obj.homelink();
		Thread.sleep(2000);
	}

	@Then("^Verify Home page is accessible to the user$")
	public void verify_Home_page_is_accessible_to_the_user() throws Throwable {
		HomePageActions_obj.homeverify();
		Thread.sleep(2000);
	}

	@When("^User click the Contact link on the Home page$")
	public void user_click_the_Contact_link_on_the_Home_page() throws Throwable {
		HomePageActions_obj.contactlink();
		Thread.sleep(2000);
	}

	@Then("^Verify Contact page is accessible to the user$")
	public void verify_Contact_page_is_accessible_to_the_user() throws Throwable {
		ContactPageActions_obj.contactverify();
		Thread.sleep(2000);
		ContactPageActions_obj.closecontactlink();
	}

	@When("^User click the About us link on the Home page$")
	public void user_click_the_About_us_link_on_the_Home_page() throws Throwable {
		HomePageActions_obj.aboutuslink();
		Thread.sleep(2000);
	}

	@Then("^Verify About us page is accessible to the user$")
	public void verify_About_us_page_is_accessible_to_the_user() throws Throwable {
		AboutUsActions_obj.verifyaboutus();
		Thread.sleep(2000);
		
	}

	@When("^User click on Cart link in Homepage$")
	public void user_click_on_Cart_link_in_Homepage() throws Throwable {
		HomePageActions_obj.cartlink();
		Thread.sleep(2000);
	}

	@Then("^Verify Cart page is accessible to the user$")
	public void verify_Cart_page_is_accessible_to_the_user() throws Throwable {
		CartPageActions_obj.cartverify();
		Thread.sleep(2000);
	}

	@When("^User click the Log in link on the Home page$")
	public void user_click_the_Log_in_link_on_the_Home_page() throws Throwable {
		HomePageActions_obj.Loginlink();
		Thread.sleep(2000);
	}

	@Then("^Verify Login page is accessible to the user$")
	public void verify_Login_page_is_accessible_to_the_user() throws Throwable {
		LoginPageActions_obj.Loginverify();
		Thread.sleep(2000);
	}

	@When("^User click the Signup link on the Home page$")
	public void user_click_the_Signup_link_on_the_Home_page() throws Throwable {
		HomePageActions_obj.signinlink();
		Thread.sleep(2000);
	}

	@Then("^Verify Sign Up page is accessible to the user$")
	public void verify_Sign_Up_page_is_accessible_to_the_user() throws Throwable {
		SignUPPageActions_obj.signinverify();
		Thread.sleep(2000);
	}






}
