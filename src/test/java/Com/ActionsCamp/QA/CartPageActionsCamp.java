package Com.ActionsCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Com.LocatorCamp.QA.CartPageLocatorCamp;
import Com.LocatorCamp.QA.HomePageLocatorCamp;
import Com.Utility.QA.BaseCamp;

public class CartPageActionsCamp extends BaseCamp{
  
	HomePageLocatorCamp HomePageLocator_obj = new HomePageLocatorCamp();
	CartPageLocatorCamp CartPageLocator_obj = new  CartPageLocatorCamp();
	
	
	
 public void cartverify() {
	boolean verifycart= CartPageLocator_obj.verifycartlink.isDisplayed();
	Assert.assertTrue(verifycart);
	}
 public void verifycartpage() {
	 boolean verifycartiteam = CartPageLocator_obj.verifycart.isDisplayed();
	 Assert.assertTrue(verifycartiteam);
 }
 public void placeorder() {
	 CartPageLocator_obj.placeorder.click();
 }
 public void placeorderform() {
	 CartPageLocator_obj.Name.sendKeys("dipti");
	 CartPageLocator_obj.Country.sendKeys("canada");
	 CartPageLocator_obj.City.sendKeys("montreal");
	 CartPageLocator_obj.creditcart.sendKeys("23455677");
	 CartPageLocator_obj.month.sendKeys("may");
	 CartPageLocator_obj.year.sendKeys("2022");
 }
 public void purchase() {
	 CartPageLocator_obj.purchase.click();
 }
 public void addedcart() {
	 CartPageLocator_obj.additeam.click();
	}
 
}
