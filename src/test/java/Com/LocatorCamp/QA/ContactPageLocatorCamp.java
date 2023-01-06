package Com.LocatorCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class ContactPageLocatorCamp extends BaseCamp{
	public ContactPageLocatorCamp() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h5[text()='New message']")
	public WebElement verifycontact;
	
	@FindBy(xpath = "//*[@id=\"recipient-email\"]")
	public WebElement email;
	
	@FindBy(xpath = "//*[@id=\"recipient-name\"]")
	public WebElement namecontact;
	
	@FindBy(id= "message-text")
	public WebElement massage;
	
	@FindBy(xpath = "//button[text()='Send message']")
	public WebElement sendMsg;
	
	@FindBy(xpath = "//span[@aria-hidden='true']")
	public WebElement closecontact;
	
	

}
