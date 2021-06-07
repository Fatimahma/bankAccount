package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANK_CASH_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement NEW_ACCOUNT_FIELD;

	public void clickBandAndCashButton() {
		BANK_CASH_FIELD.click();
	}

	public void clickNewAccountButton() {
		NEW_ACCOUNT_FIELD.click();
	}

}
