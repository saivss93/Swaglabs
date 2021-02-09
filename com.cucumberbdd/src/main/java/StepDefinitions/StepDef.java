package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.FinishPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserInfoPage;

public class StepDef extends BaseClass{

	WebDriver driver;

	@Given("^User is on the login page$")
	public void user_is_on_the_login_page(){

		System.setProperty("webdriver.gecko.driver", "/Users/SaiVanapalli/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		lp=new LoginPage(driver);

	}

	@When("^Title of the login page is free crm$")
	public void title_of_the_login_page_is_free_crm(){

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);

	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password){

		lp.setUserName(username);
		lp.setPassword(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{

		lp.clickLogin();
		Thread.sleep(2000);

	}

	@Then("^User is on home page$")
	public void user_is_on_home_page() throws InterruptedException{

		hp = new HomePage(driver);
		String title = driver.getTitle();
		System.out.println("Home page title is ::"+ title);
		Assert.assertEquals("Swag Labs", title);
		Thread.sleep(2000);

	}

	@Then("^User hits on open button$")
	public void user_hits_on_open_button() throws InterruptedException{

		hp.openMenu();
		Thread.sleep(2000);

	}

	@Then("^Navigate to name drop down$")
	public void navigate_to_name_drop_down() throws InterruptedException{

		hp.dropItem("za");
		Thread.sleep(2000);

	}

	@Then("^Select the first item to add to cart$")
	public void select_the_first_item_to_add_to_cart() throws InterruptedException{

		hp.addButton();
		Thread.sleep(2000);

	}

	@Then("^Deselect the item added to cart$")
	public void deselect_the_item_added_to_cart() throws InterruptedException{

		hp.deSelect();
		Thread.sleep(2000);

	}

	@Then("^Click on the cart$")
	public void click_on_the_cart() throws InterruptedException{

		hp.cartButton();
		Thread.sleep(2000);
	}

	@Then("^Tap on checkout$")
	public void tap_on_checkout() throws InterruptedException{

		cp = new CartPage(driver);
		cp.clickCheckoutBtn();
		Thread.sleep(2000);

	}

	@Then("^Enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and_and(String firstname, String lastname, String zipcode) throws InterruptedException{

		ui = new UserInfoPage(driver);
		ui.enterFirstName(firstname);
		ui.enterLastName(lastname);
		ui.enterPostalCode(zipcode);
		Thread.sleep(2000);

	}

	@Then("^Tap on Continue$")
	public void tap_on_Continue() throws InterruptedException{

		ui.clickCtn();
		Thread.sleep(2000);

	}

	@Then("^Tap on Finish$")
	public void tap_on_Finish() throws InterruptedException{

		fp = new FinishPage(driver);
		fp.clickFinishBtn();
		Thread.sleep(2000);

	}

	@Then("^Verify order placed$")
	public void verify_order_placed(){

		if(driver.getPageSource().contains("THANK YOU FOR YOUR ORDER"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

	@Then("^User clicks on logout$")
	public void user_clicks_on_logout() throws InterruptedException{

		hp.clickLogout();
		Thread.sleep(2000);

	}

	@Then("^Close the browser$")
	public void close_the_browser(){
		driver.quit();

	}

}
