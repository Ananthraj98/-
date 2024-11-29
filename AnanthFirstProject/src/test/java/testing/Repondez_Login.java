package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repondez_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to login page
		driver.get("https://repondez.staging.chkdin.com/login");

		// Click on the login option
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/ul/li[1]/a")).click();

		// Wait for the email input field and enter email
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='identifierId']")));
		email.sendKeys("ananthraj@chkdin.com");

		// Click the 'Next' button (fixing XPath)
		WebElement nextButton = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[3]"));
		wait.until(ExpectedConditions.elementToBeClickable(nextButton));

		// Scroll into view and click using JavaScript if regular click fails
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nextButton);
		js.executeScript("arguments[0].click();", nextButton);

		// Wait for the password input field and enter password
		WebElement passwordField = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
		passwordField.sendKeys("8248181382");

		// Click the 'Next' button for password submission (fixing XPath)
		WebElement passwordNextButton = driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[3]"));
		wait.until(ExpectedConditions.elementToBeClickable(passwordNextButton));

		// Scrol into view and click using JavaScript if regular click fails
		js.executeScript("arguments[0].scrollIntoView(true);", passwordNextButton);
		js.executeScript("arguments[0].click();", passwordNextButton);

		// Optionally close the browser and interact with an element
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@href='https://repondez.staging.chkdin.com/console/332']")));

		// oll into view using JavaScript (to avoid click interception)
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		// Click the element using JavaScript (if regular click fails)
		js.executeScript("arguments[0].click();", element);

		WebElement info = driver.findElement(
				By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/ul/li[1]/a/span[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(info).perform();
		WebElement details = driver.findElement(By.xpath("//*[@id=\"dash_guest\"]/li/ul/li[1]/a/span"));
		details.click();

		driver.findElement(By.id("reportrange")).click();

		String startDate = "1"; // Example: 15th of the month
		WebElement startDay = driver.findElement(By.xpath("//td[@class='available' and text()='" + startDate + "']"));
		startDay.click();

		// Select End Date
		String endDate = "6"; // Example: 20th of the month
		WebElement endDay = driver.findElement(By.xpath("//td[@class='available' and text()='" + endDate + "']"));
		endDay.click();

	}
}
