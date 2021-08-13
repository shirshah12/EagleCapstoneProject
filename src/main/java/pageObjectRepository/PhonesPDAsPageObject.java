package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
	private WebElement PhonesAndPDAs;
	
	@FindBy(id = "//button[@id ='list-view']")
	private WebElement List;
	
	@FindBy(id = "//button[@id='grid-view']")
	private WebElement Grid;
	
	@FindBy(id = "//a[@id='compare-total']")
	private WebElement ProductCompare;
	
	@FindBy(className = "(//label[@class='input-group-addon'])[1]")
	private WebElement SortByiPhone;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement iPhoneSearchBar;
	
	@FindBy(className = "(//label[@class='input-group-addon'])[2]")
	private WebElement SortByPalmTreoPro;
	
	@FindBy(className = "(//select[@class='form-control'])[2]")
	private WebElement PalmTreoProSearchBar;
	
	@FindBy(className = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement HTCTouchHD;
	
	@FindBy(className = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
	private WebElement HTCTouchHDAddToCart;
	
	@FindBy(className = "(//i[@class='fa fa-heart'])[2]")
	private WebElement HTCTouchHDAddToWishList;
	
	@FindBy(className = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement HTCTouchHDCompareThis;
	
}
	
	
	
	
	
	
