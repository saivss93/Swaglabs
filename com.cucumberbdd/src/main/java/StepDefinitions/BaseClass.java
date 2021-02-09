package StepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.FinishPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserInfoPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public CartPage cp;
	public UserInfoPage ui;
	public FinishPage fp;
}
