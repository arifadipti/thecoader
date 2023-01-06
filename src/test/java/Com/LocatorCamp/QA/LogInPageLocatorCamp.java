package Com.LocatorCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class LogInPageLocatorCamp extends BaseCamp{
	
	public LogInPageLocatorCamp() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "logInModalLabel")
	public WebElement verifyloginlink;
	
	@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[1]/button/span")
	public WebElement closelogin;
	
	@FindBy(id = "loginusername")
	public WebElement usernamefield;
	
	@FindBy(id = "loginpassword")
	public WebElement passwordfield;
	
	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement loginbutton;
}
