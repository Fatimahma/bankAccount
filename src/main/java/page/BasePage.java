package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public int generateNumber(int bound) {
		Random rnd = new Random();
		int generatedNumber = rnd.nextInt(bound);
		return generatedNumber;
	}

	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
	}
	
	public void takeScreenShot(WebDriver driver) {
		TakesScreenshot st = ((TakesScreenshot)driver);
		SimpleDateFormat  df = new SimpleDateFormat ("MMddyyHHmmss");
		File f = st.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"/screenshot/"+ df.format(System.currentTimeMillis())+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

