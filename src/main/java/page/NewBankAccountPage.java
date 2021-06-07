package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewBankAccountPage extends BasePage {
	WebDriver driver;

	public NewBankAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id = 'account']")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'description']")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'balance']")
	WebElement INITIAL_BALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'account_number']")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'contact_person']")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'contact_phone']")
	WebElement CONTACT_PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'ib_url']")
	WebElement BANKING_URL_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@type = 'submit' and @class = 'btn btn-primary']")
	WebElement SUMIT_BUTTON_FOR_NEW_ACCOUNT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement ADD_BANK_ACCOUNT_SUCCESS_TEXT;

	public void enterAccountTitle(String accountTitle) {
		waitForElement(driver, 5, ACCOUNT_TITLE_FIELD);
		ACCOUNT_TITLE_FIELD.sendKeys(accountTitle + generateNumber(9999));
	}

	public void enterDescription(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
	}

	public void enterInitialBalance(String balance) {
		INITIAL_BALANCE_FIELD.sendKeys(balance);
	}

	public void enterAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber + generateNumber(9999));
	}

	public void enterContactPerson(String contactPerson) {
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
	}

	public void enterPhone(String phone) {
		CONTACT_PHONE_FIELD.sendKeys(phone);
	}

	public void enterURL(String url) {
		BANKING_URL_FIELD.sendKeys(url);
	}

	public void clickSumbitButtonOnNewBankAccount() {
		SUMIT_BUTTON_FOR_NEW_ACCOUNT.click();
	}

	public void verifyBankAccountCreated() throws IOException {
		waitForElement(driver, 10, ADD_BANK_ACCOUNT_SUCCESS_TEXT);
		Assert.assertTrue(ADD_BANK_ACCOUNT_SUCCESS_TEXT.getText().contains("Account Created Successfully"));
		takeScreenShot(driver);

	}
}
