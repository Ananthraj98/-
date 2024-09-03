package Testng_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Event_POM {
WebDriver d;
	
By EventPath= (By.xpath("/html/body/nav/div/div/ul/li[2]/a"));
By ColonButton=(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/button"));

	public Event_POM(WebDriver d)   {
		this.d=d;	
	}

	public void Event(WebDriverWait wait) {
		WebElement eve= wait.until(ExpectedConditions.elementToBeClickable(EventPath));
		eve.click();
		WebElement Colon= wait.until(ExpectedConditions.elementToBeClickable(ColonButton));
		Colon.click();
	}

	
}


