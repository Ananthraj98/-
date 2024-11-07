package Testng_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Event_POM {
	WebDriver d;
	By CreateEvent = By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[1]/a");
	By Details = By.xpath("/html/body/div[10]/div[2]/div/div/div[2]/div/div/ul/li[1]/a");
	By Eventname = By.id("event-name");
	By SelectCategory = By.xpath(
			"/html/body/div[10]/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/form/div[1]/div[2]/div/div/div[2]/div/button/div/div/div");

	public Event_POM(WebDriver d) {
		this.d = d;
	}

	public void Event(WebDriverWait wait) throws InterruptedException {
		WebElement Create = wait.until(ExpectedConditions.elementToBeClickable(CreateEvent));
		Create.click();
		WebElement det = wait.until(ExpectedConditions.elementToBeClickable(Details));
		det.click();
		WebElement name = d.findElement(Eventname);
		name.sendKeys("Cricket");
		WebElement selcat = d.findElement(SelectCategory);
		selcat.click();
		
	}

}
