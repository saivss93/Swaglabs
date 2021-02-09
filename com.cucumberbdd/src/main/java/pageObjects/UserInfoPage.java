package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {
	
	public WebDriver ldriver;
	
	public UserInfoPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	@CacheLookup
	WebElement postalcode;
	
	@FindBy(xpath = "//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[2]/input[1]")
	@CacheLookup
	WebElement continuebtn;
	
	@FindBy(xpath = "//a[contains(text(),'CANCEL')]")
	@CacheLookup
	WebElement cancelbtn;
	
	public void enterFirstName(String fname) {
		
		firstname.sendKeys(fname);
		
	}
	
	public void enterLastName(String lname) {
		
		lastname.sendKeys(lname);
		
	}
	
	public void enterPostalCode(String pcode) {
		
		postalcode.sendKeys(pcode);
		
	}
	
	public void clickCtn() {
		
		continuebtn.click();
		
	}
	
	public void clickCancelBtn() {
		
		cancelbtn.click();
	}
	
}
