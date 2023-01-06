package StepDepCamp;

import Com.ActionsCamp.QA.AboutUsActionsCamp;
import Com.ActionsCamp.QA.HomePageActionsCamp;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_75 extends BaseCamp {
	
	HomePageActionsCamp HomePageActions_obj = new HomePageActionsCamp();
	AboutUsActionsCamp AboutUsActions_obj = new AboutUsActionsCamp();

	
	@Then("^Verify About us text will display on the About us page$")
	public void verify_About_us_text_will_display_on_the_About_us_page() throws Throwable {
		AboutUsActions_obj.verifyaboutus();
	}

	@When("^User click the play icon of the video on the About us page$")
	public void user_click_the_play_icon_of_the_video_on_the_About_us_page() throws Throwable {
		AboutUsActions_obj.playbutton();
		Thread.sleep(5000);
	}

	@When("^The user can pause the video anytime$")
	public void the_user_can_pause_the_video_anytime() throws Throwable {
		AboutUsActions_obj.pausebutton();
		Thread.sleep(3000);
		ScreenshotsCamp.screenshot(driver,"aboutusvideo");
	}

	@Then("^Verify User is able to close the page after once click the close button$")
	public void verify_User_is_able_to_close_the_page_after_once_click_the_close_button() throws Throwable {
		AboutUsActions_obj.Cancelaboutus();
	}


}
