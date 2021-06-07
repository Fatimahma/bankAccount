package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DashboardPage;
import page.LoginPage;
import page.NewBankAccountPage;
import util.BrowserFactory;

public class AddBankAccountStepDef {

	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewBankAccountPage newBankAccountPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^user is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}

	@When("^user enters the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_the_username_as_and_password_as(String username, String password) {
		loginPage.enterCredentials(username, password);
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		loginPage.clickOnSignInButton();
	}

	@Then("^user should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginPage.takeScreenshotAfterLogin(driver);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@When("^user clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() {
		dashboardPage.clickBandAndCashButton();
	}

	@When("^user clicks on new account$")
	public void user_clicks_on_new_account() {
		dashboardPage.clickNewAccountButton();
		newBankAccountPage = PageFactory.initElements(driver, NewBankAccountPage.class);

	}

	@When("^user fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accountTitle,
			String description, String initialBalance, String accountNumber, String contactPerson, String phone,
			String internalBankingUrl) {
		newBankAccountPage.enterAccountTitle(accountTitle);
		newBankAccountPage.enterDescription(description);
		newBankAccountPage.enterInitialBalance(initialBalance);
		newBankAccountPage.enterAccountNumber(accountNumber);
		newBankAccountPage.enterContactPerson(contactPerson);
		newBankAccountPage.enterPhone(phone);
		newBankAccountPage.enterURL(internalBankingUrl);
		newBankAccountPage.clickSumbitButtonOnNewBankAccount();
	}

	@Then("^user should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws Throwable {
		newBankAccountPage.verifyBankAccountCreated();

	}

}
