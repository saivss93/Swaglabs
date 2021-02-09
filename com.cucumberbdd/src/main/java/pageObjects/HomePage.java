package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public WebDriver ldriver;

	public HomePage(WebDriver rdriver) 
	{

		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "//button[contains(text(),'Open Menu')]")
	@CacheLookup
	WebElement Openbtn;

	By drpname = By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[3]/select[1]");

	@FindBy(xpath = "//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement addbtn;

	@FindBy(xpath = "//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement deaddbtn;

	@FindBy(xpath = "//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[@id='shopping_cart_container']/a[1]")
	@CacheLookup
	WebElement cartbtn;

	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	@CacheLookup
	WebElement logoutbtn;

	public void openMenu() {
		Openbtn.click();
	}

	public void dropItem(String value) {

		Select drp = new Select(ldriver.findElement(drpname));
		drp.selectByValue(value);

	}

	public void addButton() {
		addbtn.click();
	}

	public void deSelect() {
		deaddbtn.click();

	}

	public void cartButton() {
		cartbtn.click();
	}

	public void clickLogout() {
		logoutbtn.click();
	}













}
