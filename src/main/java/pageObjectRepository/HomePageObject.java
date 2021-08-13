package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base {

	// we create a constructor and inside the constructor we will
	// define PageFactory class and call InitLements method
	// to initialize all variables of this class
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement Currency;

	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement ChoseEuro;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement CurChanegedToEuro;

	
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement ShopingCart;

	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[1]")
	private WebElement Yourshoppingcartisempty;

	
	
	public void clickOnCurrency() {
		WebDriverUtility.clickOnElement(Currency);
	}

	public void clickOnChoseEuro() {
		WebDriverUtility.clickOnElement(ChoseEuro);
	}

	public void clickOnCurChanegedToEuro() {
		WebDriverUtility.clickOnElement(CurChanegedToEuro);
	}

	public void clickOnShopingCart() {
		WebDriverUtility.clickOnElement(ShopingCart);
	}

	public String Yourshoppingcartisempty() {
		return Yourshoppingcartisempty.getText();
	}
}


