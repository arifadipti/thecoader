package Com.LocatorCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class AboutUsLocatorCamp extends BaseCamp{
	
	public AboutUsLocatorCamp() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "videoModalLabel")
	public WebElement verifyaboutus;
	
	@FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div[1]/button/span")
	public WebElement Xaboutus;
    
	
	@FindBy(xpath = "//button[@title='Play Video']")
	public WebElement playbutton;
	
	@FindBy(xpath="//button[@title='Pause']")
	public WebElement pausebutton;
	
	
	
	
}
