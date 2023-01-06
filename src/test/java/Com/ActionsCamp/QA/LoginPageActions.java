package Com.ActionsCamp.QA;

import org.testng.Assert;

import Com.LocatorCamp.QA.HomePageLocatorCamp;
import Com.LocatorCamp.QA.LogInPageLocatorCamp;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;

public class LoginPageActions extends BaseCamp{

	HomePageLocatorCamp HomePageLocator_obj = new HomePageLocatorCamp();
	LogInPageLocatorCamp LogInPageLocator_obj = new LogInPageLocatorCamp();
	
	
	
	public void Loginverify() {
		boolean verifylogin = LogInPageLocator_obj.verifyloginlink.isDisplayed();
		Assert.assertTrue(verifylogin);
		
	}
	public void Loginclose() {
		LogInPageLocator_obj.closelogin.click();
	}
	public void validusername() {
		LogInPageLocator_obj.usernamefield.sendKeys("Black Widow");
	}
	public void validpassword() {
		LogInPageLocator_obj.passwordfield.sendKeys("Black7");
	}
	public void clicklogin() {
		LogInPageLocator_obj.loginbutton.click();
		
	}
	public void invalidusername() {
		LogInPageLocator_obj.usernamefield.sendKeys("hello");
	}
	public void invalidpassword() {
		LogInPageLocator_obj.passwordfield.sendKeys("d123");
	}
	public void verifyunsuccessfullogIn() {
		driver.switchTo().alert().accept();
	}
}
