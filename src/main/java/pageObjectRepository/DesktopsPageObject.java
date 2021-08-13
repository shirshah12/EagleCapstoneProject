package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

//Scenario 1 (@Desktop) This include 2 lines of (Background)
//desktop scenario has one line of object I got(Example of category description text)

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement DesktopTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement ShowAllDesktops;

	@FindBy(xpath = "//p[contains(text(),'Example of category description text')]")
	private WebElement ItemsArePresentOnDeskTops;
// it should show one item to prove that the user is seeing (All items are present in desktop page)

	public void clickOnDesktopTab() {
		WebDriverUtility.clickOnElement(DesktopTab);
	}

	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(ShowAllDesktops);
	}

	public void itemsArePresent() {
		WebDriverUtility.clickOnElement(ItemsArePresentOnDeskTops);
	}

//Scenario 2 (@AddHpLP3065)
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement AddToCartHPLP3065;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement QuantityOfHPLP3065;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement CartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement SuccessMessageAppeared;
	

	public void addHPToCart() {
		WebDriverUtility.clickOnElement(AddToCartHPLP3065);
	}

	public void choosehpQuantity() {
		WebDriverUtility.clickOnElement(QuantityOfHPLP3065);

	}

	public void cartButton() {
		WebDriverUtility.clickOnElement(CartButton);
	}

	public String SuccessMessageAppeared() {
		return SuccessMessageAppeared.getText();
	}
	
	
//scenario 3 @AddCanonEOS5D
	
	@FindBy(xpath = "(//span[@class = 'hidden-xs hidden-sm hidden-md'])[8]")
	public WebElement AddToCartCanonEOS5D;
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement dropdown;

	@FindBy(id = "input-quantity")
	private WebElement QuantityOfCononEOS5D;
	
	@FindBy(id = "button-cart")
	private WebElement AddToCartButton;

	@FindBy(xpath = "//div[@class= 'alert alert-success alert-dismissible']")
	public WebElement SuccessMessage;
	
	public void AddCononToCart() {
		WebDriverUtility.clickOnElement(AddToCartCanonEOS5D);
	}

	public void select() {
		Select select = new Select(dropdown);
		((WebElement) select).getText();
	}
	
	public void ChooseCanonQuantity() {
		WebDriverUtility.clickOnElement(QuantityOfCononEOS5D);
	}
	
	public void AddToCartButton() {
		WebDriverUtility.clickOnElement(CartButton);
	}

	public String SuccessMessage() {
		return SuccessMessageAppeared.getText();
	}
	
	
	
	
	
	
}

