package StepDepCamp;

import Com.ActionsCamp.QA.ContactPageActionsCamp;
import Com.ActionsCamp.QA.HomePageActionsCamp;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_74 extends BaseCamp{
	
	HomePageActionsCamp HomePageActions_obj = new HomePageActionsCamp();
	ContactPageActionsCamp ContactPageActions_obj = new ContactPageActionsCamp();
	
	
	@Then("^Verify the Contact name field on the  Contact page$")
	public void verify_the_Contact_name_field_on_the_Contact_page() throws Throwable {
		ContactPageActions_obj.contactverify();
		Thread.sleep(3000);
	}

	@When("^User enters the Contact email$")
	public void user_enters_the_Contact_email() throws Throwable {
		ContactPageActions_obj.contactemail();
		Thread.sleep(3000);
	}

	@When("^User enters Contact name$")
	public void user_enters_Contact_name() throws Throwable {
		ContactPageActions_obj.Contactname();
		Thread.sleep(3000);
	}

	@When("^User writes a messages$")
	public void user_writes_a_messages() throws Throwable {
		ContactPageActions_obj.Massage();
		Thread.sleep(3000);
	}

	@When("^User click on Send message button$")
	public void user_click_on_Send_message_button() throws Throwable {
		ContactPageActions_obj.Sendmassage();
		Thread.sleep(3000);
	}

	@Then("^Verifyu User able to send messages$")
	public void verifyu_User_able_to_send_messages() throws Throwable {
		ContactPageActions_obj.verifymassage();
		ScreenshotsCamp.screenshot(driver,"verifysendmsg");
	}

	@When("^User does not enter the Contact email$")
	public void user_does_not_enter_the_Contact_email() throws Throwable {
		
	}

	@When("^User  does not enter the Contact name$")
	public void user_does_not_enter_the_Contact_name() throws Throwable {
		
	}

	@When("^User does not write a messages$")
	public void user_does_not_write_a_messages() throws Throwable {
		
	}

	@Then("^Verify User does not able to send messages after once click Send message button$")
	public void verify_User_does_not_able_to_send_messages_after_once_click_Send_message_button() throws Throwable {
		ContactPageActions_obj.verifymassage();
		ScreenshotsCamp.screenshot(driver,"verifyunsend");
		
	}

}
