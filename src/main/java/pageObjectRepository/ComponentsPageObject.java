package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class ComponentsPageObject extends Base {
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName = "(//a[@class='dropdown-toggle'])[4]")
	private WebElement Components; //do mouse over, it is a dropdown
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement ShowAllComponents;
	
	@FindBy(xpath = "//h2[contains(text(),'Components')]")
	private WebElement ComponentsInsidePage;
	
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement RefineSearch;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement MiceAndTrackBalls;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement Monitors;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement Painters;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	private WebElement Scanners;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
	private WebElement WebCameras;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement DeskTopImage;
	

}
