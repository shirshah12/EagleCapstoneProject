package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;
import cucumber.api.java.en.Then;
public class HomePageTestStepDef extends Base{
	
	// create object of Login Page Object in order to access its methods
	
	HomePageObject currency = new HomePageObject();
	HomePageObject shoppingCard = new HomePageObject();
	
	// every Step in Scenario needs to have
	// a method associated with in StepDefinitons class
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_Website() {
		openBrowser();
		logger.info("Retail Website is opened");
		//WebDriverUtility.screenShot();
	}
	
	@When("^User click on currency$")
	public void user_click_on_Currency() {
		currency.clickOnCurrency();
		logger.info("User clicked on Currency");
	}
	
	@And("^User Chose Euro from dropdown$")
	public void user_click_on_dropDown() {
		currency.clickOnChoseEuro();
		logger.info("User Clicked on Euro");
	}
		
    @Then("^currency value should change to Euro$")
		public void currency_value_should_change_to_Euro() {
			currency.clickOnCurChanegedToEuro();
			logger.info("currency changed to Euro");
	}

    @When("^User click on shopping cart$")
    public void user_click_on_shopping_cart() {
    	shoppingCard.clickOnShopingCart();
		logger.info("User clicked on shoppingCard");
    }

    @Then("^\"([^\"]*)\" message should display$")
    public void message_should_display(String arg1)  {
    	shoppingCard.Yourshoppingcartisempty();
    	logger.info("Your Shopping cart is empty!"); 
    	
    }
}


