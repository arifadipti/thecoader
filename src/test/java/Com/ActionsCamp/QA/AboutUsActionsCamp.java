package Com.ActionsCamp.QA;

import org.testng.Assert;

import Com.LocatorCamp.QA.AboutUsLocatorCamp;
import Com.LocatorCamp.QA.HomePageLocatorCamp;
import Com.Utility.QA.BaseCamp;

public class AboutUsActionsCamp extends BaseCamp{
  
	HomePageLocatorCamp HomePageLocator_obj = new HomePageLocatorCamp();
	AboutUsLocatorCamp AboutUsLocator_obj = new AboutUsLocatorCamp();
	
	
	
	public void verifyaboutus() {
		
		boolean verifyaboutus = AboutUsLocator_obj.verifyaboutus.isDisplayed();
		Assert.assertTrue(verifyaboutus);
		
	}
	
	public void Cancelaboutus() {
		AboutUsLocator_obj.Xaboutus.click();
	}
	
	
	
	public void playbutton() {
		AboutUsLocator_obj.playbutton.click();
	}
	public void pausebutton() {
		AboutUsLocator_obj.pausebutton.click();
	}
	
}
