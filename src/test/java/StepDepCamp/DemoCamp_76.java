package StepDepCamp;


import Com.ActionsCamp.QA.CartPageActionsCamp;
import Com.ActionsCamp.QA.HomePageActionsCamp;
import Com.Utility.QA.BaseCamp;
import Com.Utility.QA.ScreenshotsCamp;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCamp_76 extends BaseCamp{
	
	
	
	CartPageActionsCamp CartPageActions_obj = new CartPageActionsCamp();
	HomePageActionsCamp HomePageActions_obj = new HomePageActionsCamp();
	
	
	@When("^Click on an item$")
	public void click_on_an_item() throws Throwable {
		HomePageActions_obj.selectiteam();
	}

	@When("^Click on add to Cart button$")
	public void click_on_add_to_Cart_button() throws Throwable {
		CartPageActions_obj.addedcart();
	}

	@When("^Click on the Cart link$")
	public void click_on_the_Cart_link() throws Throwable {
		HomePageActions_obj.cartlink();
	}

	@Then("^Verify after adding the item, items displayed on the Cart page$")
	public void verify_after_adding_the_item_items_displayed_on_the_Cart_page() throws Throwable {
		CartPageActions_obj.cartverify();
	}

	@When("^Click on the place order button$")
	public void click_on_the_place_order_button() throws Throwable {
		CartPageActions_obj.placeorder();
	}

	@When("^Fill up the place order form$")
	public void fill_up_the_place_order_form() throws Throwable {
		CartPageActions_obj.placeorderform();
	}

	@When("^Click on the purchase button$")
	public void click_on_the_purchase_button() throws Throwable {
		CartPageActions_obj.purchase();
		Thread.sleep(2000);
	}

	@Then("^Verify the purchase message$")
	public void verify_the_purchase_message() throws Throwable {
	    ScreenshotsCamp.screenshot(driver, "orderpage");
	}


}
