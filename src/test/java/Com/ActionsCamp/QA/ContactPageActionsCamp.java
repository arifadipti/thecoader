package Com.ActionsCamp.QA;

import org.testng.Assert;

import Com.LocatorCamp.QA.ContactPageLocatorCamp;
import Com.LocatorCamp.QA.HomePageLocatorCamp;
import Com.Utility.QA.BaseCamp;

public class ContactPageActionsCamp extends BaseCamp{
	
	ContactPageLocatorCamp ContactPageLocator_obj = new ContactPageLocatorCamp();
	HomePageLocatorCamp HomePageLocator_obj = new HomePageLocatorCamp();
	


	
	public void contactverify() {
		boolean verify = ContactPageLocator_obj.verifycontact.isDisplayed();
		Assert.assertTrue(verify);
		
	}
   public void closecontactlink() {
	ContactPageLocator_obj.closecontact.click();
		
	}
public void contactemail() {
	
	ContactPageLocator_obj.email.sendKeys("arifadipty5@gmail.com");
}
public void Contactname() {
	ContactPageLocator_obj.namecontact.sendKeys("Black Widow");
}
public void Massage() {
	ContactPageLocator_obj.massage.sendKeys("Thank you");
}
public void Sendmassage() {
	ContactPageLocator_obj.sendMsg.click();
}
public void verifymassage() {
	driver.switchTo().alert().accept();
}


}
