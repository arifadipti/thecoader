package Com.LocatorCamp.QA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Utility.QA.BaseCamp;

public class CartPageLocatorCamp extends BaseCamp{
	
	public CartPageLocatorCamp() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h2[text()='Products']")
	public WebElement verifycartlink;
	
	@FindBy(xpath = "//h2[text()='Products']")
	public WebElement verifycart;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	public WebElement placeorder;
	
	@FindBy(id = "name")
	public WebElement Name;
	
	@FindBy(id = "country")
	public WebElement Country;
	
	@FindBy(id = "city")
	public WebElement City;
	
	@FindBy(id = "card")
	public WebElement creditcart;
	
	@FindBy(id = "month")
	public WebElement month;
	
	@FindBy(id = "year")
	public WebElement year;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	public WebElement purchase;
	
	@FindBy(linkText = "Add to cart")
	public WebElement additeam;

}

