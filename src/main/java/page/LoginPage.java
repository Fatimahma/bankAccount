package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;

	// Interactive method
	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void enterCredentials(String userName, String password) {
		User_Name.sendKeys(userName);
		Password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SignIn.click();
	}
	
	public void takeScreenshotAfterLogin(WebDriver driver) {
		takeScreenShot(driver);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
}
