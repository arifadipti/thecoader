package Com.ActionsCamp.QA;

import org.testng.Assert;

import Com.LocatorCamp.QA.HomePageLocatorCamp;
import Com.LocatorCamp.QA.SignUpPageLocatorCamp;
import Com.Utility.QA.BaseCamp;

public class SignUPPageActionsCamp extends BaseCamp{
	
	HomePageLocatorCamp HomePageLocator_obj = new HomePageLocatorCamp();
	SignUpPageLocatorCamp SignUpPageLocator_obj = new SignUpPageLocatorCamp();

	
	  
public void signinverify() {
	boolean verifysignin = SignUpPageLocator_obj.verifysignINlink.isDisplayed();
	Assert.assertTrue(verifysignin);
	
		  
	  }
public void signinclose() {
	SignUpPageLocator_obj.closesignIN.click();
}
public void usernameverify() {
	boolean userverify = SignUpPageLocator_obj.usernametext.isDisplayed();
	Assert.assertTrue(userverify);
}
public void username() {
	SignUpPageLocator_obj.usernamefield.clear();
}
public void password() {
	SignUpPageLocator_obj.passwordfield.clear();
}
public void signin() {
	SignUpPageLocator_obj.signup.click();
	
}
public void verifyunsuccessfulsignin() {
	
	driver.switchTo().alert().accept();
}
}
