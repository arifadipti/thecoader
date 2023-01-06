package Com.LocatorCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class SignUpPageLocatorCamp extends BaseCamp{
	
	public SignUpPageLocatorCamp() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "signInModalLabel")
	public WebElement verifysignINlink;
	
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[1]/button/span")
	public WebElement closesignIN;
	
    @FindBy(xpath = "//label[text()='Username:']")
    public WebElement usernametext;
    
    @FindBy(id = "sign-username")
    public WebElement usernamefield;
    
    @FindBy(id = "sign-password")
    public WebElement passwordfield;
    
    @FindBy(xpath = "//button[text()='Sign up']")
    public WebElement signup;
	
	
	
	
	
}
