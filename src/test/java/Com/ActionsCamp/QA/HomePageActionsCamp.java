package Com.ActionsCamp.QA;

import org.testng.Assert;

import Com.LocatorCamp.QA.HomePageLocatorCamp;
import Com.Utility.QA.BaseCamp;

public class HomePageActionsCamp extends BaseCamp{

	HomePageLocatorCamp HomePageLocator_obj = new HomePageLocatorCamp();
	
	public void alllinks() {
		boolean toplinkverify =HomePageLocator_obj.toplink.isDisplayed();
		Assert.assertTrue(toplinkverify);
	}
	
	public void homelink() {
		HomePageLocator_obj.home.click();
		
	}
public void aboutuslink() {
		
		HomePageLocator_obj.aboutus.click();
	}
	
	public void homeverify() {
		boolean homeverify =HomePageLocator_obj.verifyhome.isDisplayed();
		Assert.assertTrue(homeverify);
	}
	public void contactlink() {
		HomePageLocator_obj.contact.click();
			
		}
	public void cartlink() {
		HomePageLocator_obj.cart.click();
	
      }
	public void Loginlink() {
		HomePageLocator_obj.logIN.click();
		
	}
	public void signinlink() {
		  HomePageLocator_obj.signIN.click();
	  }
	public void selectiteam() {
		  HomePageLocator_obj.iteam.click();
	  }
	
}
