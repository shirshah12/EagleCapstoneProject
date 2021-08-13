package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName = "(//a[@class='dropdown-toggle'])[6]")
	private WebElement Mp3Players;
	
	@FindBy(xpath = "(//a[contains(text(),'Show All MP3 Players')]")
	private WebElement ShowAllMP3Players;
	
	@FindBy(xpath = "(//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement Test11;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement Test12;
	
	@FindBy(xpath = "(//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1")
	private WebElement Test15;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	private WebElement Test16;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
	private WebElement Test17;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement Test18;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement Test19;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")
	private WebElement Test20;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")
	private WebElement Test21;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[5]/a[1]")
	private WebElement Test22;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]")
    private WebElement Test23;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]")
    private WebElement Test24;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[3]/a[1]")
    private WebElement Test4;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/a[1]")
    private WebElement Test5;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[5]/a[1]")
    private WebElement Test6;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[1]/a[1]")
    private WebElement Test7;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[2]/a[1]")
    private WebElement Test8;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[3]/a[1]")
    private WebElement Test9;
	
	@FindBy(id = "list-view")
	private WebElement List;
	
	@FindBy(id = "grid-view")
	private WebElement grid;
	
	@FindBy(id = "compare-total")
	private WebElement ProductComputer;
	
	@FindBy(xpath = "(//label[@class='input-group-addon'])[1]")
	private WebElement SortBy;
	
	@FindBy(id = "input-sort")
	private WebElement Default;
	
	@FindBy(xpath = "(//label[@class='input-group-addon'])[2]")
	private WebElement SortBy2;
	
	@FindBy(id = "input-limit")
	private WebElement Default2;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement iPadClassic;
	
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
	private WebElement iPodClassicAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]]")
	private WebElement AddToWishList;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[1]")
	private WebElement ComparethisProdcut;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Nano')]")
	private WebElement iPodNano;
	
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement iPodNanoAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]]")
	private WebElement AddToWishListNano;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement ComparethisProdcutNano;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]")
	private WebElement iPodShuffle;
	
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[9]")
	private WebElement iPodiPodShuffleAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]]")
	private WebElement AddToWishListiPodShuffle;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement ComparethisProdcutiPodShuffle;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Touch')]")
	private WebElement iPodTouch;
	
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[10]")
	private WebElement iPodiPodTouchAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]]")
	private WebElement AddToWishListiPodTouch;
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[4]")
	private WebElement ComparethisProdcutiPodTouch;
	
	public void clickOnMp3Players() {
		WebDriverUtility.clickOnElement(Mp3Players);
	}
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
