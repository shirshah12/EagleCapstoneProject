package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopsPageObject;
import utilites.WebDriverUtility;

public class DesktopsPageTestStepDef extends Base {

	
	DesktopsPageObject desktops = new DesktopsPageObject();

//Scenario 1 (@Desktop) it runs after (Background)

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		desktops.clickOnDesktopTab();
		logger.info("User clicked on Desktob Tab");
	}

	@And("^User click on Show all desktop page$")
	public void user_click_on_Show_all_desktop_page() {
		desktops.clickOnShowAllDesktops();
		logger.info("User clicked on Show All Desktobs");
	}

	@Then("^user should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		WebDriverUtility.wait(5000);
		logger.info("User see all items are present");
	}

//Scenario 2 (@AddHpLP3065)

	@And("^User click on ADD TO CART option on \"HP LP3065\" item$")
	public void user_click_on_ADD_TO_CART_option_on_HP_LP_item() {
		desktops.addHPToCart();
		logger.info("User clicked on ADD TO CART");
	}

	@And("^User select quantity \"1\"$")
	public void user_select_quantity() {
		desktops.choosehpQuantity();
		logger.info("Choose HP Quantity");
	}

	@And("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() {
		desktops.cartButton();
		logger.info("User clicked on cart button");
	}

	@Then("^User should see a message \"([^\"]*)\"$")
	public void user_should_see_a_message(String arg1) {
		desktops.SuccessMessageAppeared();
		String actual = "Success: You have added HP LP3065 to your shopping cart!";
		System.out.println(actual.substring(0, 55));
		WebDriverUtility.screenShot();

	}

	
	//scenario 3 @AddCanonEOS5D
	
	@When("^User click ADD TO CART option on 'Canon EOS (\\d+)D' item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1)  {
	 desktops.AddCononToCart();  
	 logger.info("User click ADD TO CART option on 'Canon EOS 5D' item");
	}

	@When("^User select color from dropdown 'Red'$")
	public void user_select_color_from_dropdown_Red(WebElement dropdown) {
		Select select = new Select (dropdown);
		select.selectByVisibleText("Red");
	 logger.info("User select color from dropdown 'Red'");
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	@Then("^User should see a message 'Success: You have added Canon EOS (\\d+)D to your shopping cart!'$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) {
		String actual = "Success: You have added HP LP3065 to your shopping cart!";
		System.out.println(actual.substring(0, 55));
		WebDriverUtility.screenShot();    
	}
}