package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
	
public WebDriver ldriver;
	
	public FinishPage(WebDriver rdriver) 
	{
		
	ldriver = rdriver;
	PageFactory.initElements(ldriver, this);
	
	}
	
	@FindBy(xpath = "//a[contains(text(),'FINISH')]")
	@CacheLookup
	WebElement finishbtn;
	
	public void clickFinishBtn() {
		
		finishbtn.click();
	}

}
