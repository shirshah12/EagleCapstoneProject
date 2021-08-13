package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {
	
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() = 'Software']")
	private WebElement Software;
	
	@FindBy(xpath = "//a[text() = 'Continue']")
	private WebElement Continue; 
	
}
