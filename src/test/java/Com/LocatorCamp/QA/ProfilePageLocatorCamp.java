package Com.LocatorCamp.QA;

import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class ProfilePageLocatorCamp extends BaseCamp{
	
	public ProfilePageLocatorCamp() {
		
		PageFactory.initElements(driver,this);
	}

}
