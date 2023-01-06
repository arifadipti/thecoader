package Com.LocatorCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class HomePageLocatorCamp extends BaseCamp{
	
	public HomePageLocatorCamp() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//ul[@class='navbar-nav ml-auto']")
	public WebElement toplink;
	
	@FindBy(xpath = "//a[@class='nav-link']")
	public WebElement home;
	
	@FindBy(id = "cat")
	public WebElement verifyhome;
	
	@FindBy(linkText = "Contact")
	public WebElement contact;
	
	
	
	@FindBy(linkText = "About us")
	public WebElement aboutus;
	
	@FindBy(linkText = "Cart")
	public WebElement cart;
	
	
	@FindBy(id = "login2")
	public WebElement logIN;
	
	
	
	@FindBy(id = "signin2")
	public WebElement signIN;
	
	@FindBy(linkText = "Samsung galaxy s6")
	public WebElement iteam;

}
