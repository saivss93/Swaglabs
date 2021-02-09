package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "user-name")
	@CacheLookup
	WebElement usrname;

	@FindBy(name = "password" )
	@CacheLookup
	WebElement passd;

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement loginbtn;

	public void setUserName(String uname) {

		usrname.sendKeys(uname);
	}

	public void setPassword(String pwd) {

		passd.sendKeys(pwd);

	}

	public void clickLogin() {

		loginbtn.click();
	}	

}
