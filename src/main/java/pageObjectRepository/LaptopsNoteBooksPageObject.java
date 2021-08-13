package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;


public class LaptopsNoteBooksPageObject extends Base {
	
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement LaptopsAndNoteBooks; //do mouse over, it is a dropdown
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptopsAndNotebooks;
	
	@FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
	private WebElement LaptopsAndNotebooks;
	
	@FindBy(xpath = "//img[@alt='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksPic;
	
	@FindBy(xpath = "//p[contains(text(),'Shop Laptop feature only the best laptop deals on ')]")
	private WebElement LaptopTextDiscription;
	
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement RefineSearch;
	
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement HPLP3065;
	
	@FindBy(xpath = "//p[contains(text(),'Stop your co-workers in their tracks with the stun')]")
	private WebElement HpTextDiscription;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement MacBook;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement MacBookAir;
	
	@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin, ultraportable, and ultra')]")
	private WebElement MacBookAirText;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement MacBookPro;
	
	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
	private WebElement SonyVAIO;
	
	@FindBy(xpath = "//p[contains(text(),'Unprecedented power. The next generation of proces')]")
	private WebElement SonyVAIOText;
	
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 5 of 5 (1 Pages)')]")
	private WebElement ShowingPages;
	
}

