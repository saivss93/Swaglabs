package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public WebDriver ldriver;
	
	public CartPage(WebDriver rdriver) 
	{
		
	ldriver = rdriver;
	PageFactory.initElements(ldriver, this);
	
	}
	
	@FindBy(xpath = "//a[contains(text(),'Continue Shopping')]")
	@CacheLookup
	WebElement contbtn;
	
	@FindBy(xpath = "//button[contains(text(),'REMOVE')]")
	@CacheLookup
	WebElement rembtn;
	
	@FindBy(xpath = "//a[contains(text(),'CHECKOUT')]")
	@CacheLookup
	WebElement checkbtn;
	
	public void clickContinueBtn() {
		
		contbtn.click();
	}
	
	public void clickRemoveBtn() {
		
		rembtn.click();
		
	}
	
	public void clickCheckoutBtn() {
		
		checkbtn.click();
		
	}
	
}
