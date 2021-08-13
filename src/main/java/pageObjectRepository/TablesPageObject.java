package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablesPageObject extends Base {
	
	public TablesPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Tablets')]")
	private WebElement Tables;
	
	@FindBy(className = "//i[@class='fa fa-th-list']")
	private WebElement List; 
	
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement Grid;
	
	@FindBy(id = "compare-total")
	private WebElement CompareTotal; 
	
	@FindBy(xpath = "//label[text() = 'Sort By:']")
	private WebElement SortBy;
	
	@FindBy(id = "input-sort")
	private WebElement InputSort;
	
	@FindBy(xpath = "//label[text() = 'Show:']")
	private WebElement Show;
	
	@FindBy(id = "input-limit")
	private WebElement InputLimit;
	
	@FindBy(xpath = "//a[text() = 'Samsung Galaxy Tab 10.1']")
	private WebElement SamsungGalaxyTab;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement AddToCart;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement AddToWishList;
	
	@FindBy(xpath = "//i[@class = 'fa fa-exchange']")
	private WebElement CompareThisProduct;
	
}

