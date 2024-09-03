package Testng_Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_MainPage { 
	WebDriver d;
	Event_POM objEvent_POM;
	WebDriverWait wait;
	
	POM_MainPage(int d) {
		this.d = new ChromeDriver();
		this.wait = new WebDriverWait(this.d, Duration.ofSeconds(10));
		this.objEvent_POM = new Event_POM(this.d);
	}
	
@BeforeMethod
public void login() {
		// TODO Auto-generated method stub

	        // Initialize WebDriver
	        d.get("https://ticketdev.chkdin.com/sales-report");
	        // Perform login
	        d.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/input")).sendKeys("ananthraj@chkdin.com");
	        d.findElement(By.id("user-password")).sendKeys("123456789");
	        d.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	    }

@Test
public void Event()  {
	System.out.println("Working...");
	objEvent_POM.Event(this.wait);
	
}


@AfterMethod
    public void logout() throws InterruptedException  {
    WebElement accountClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accountClick\"]/span")));
    Thread.sleep(5000);
accountClick.click();
    
    WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[2]/ul/li[2]/a[2]")));
    logoutLink.click();
    d.quit();
	}
}
