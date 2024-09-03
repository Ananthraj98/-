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

public class Ticketing {

    WebDriver d;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        d = new ChromeDriver();
        d.get("https://ticketdev.chkdin.com/sales-report");
        // Perform login
        d.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/input")).sendKeys("ananthraj@chkdin.com");
        d.findElement(By.id("user-password")).sendKeys("123456789");
        d.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
    }

    @Test
    public void loginTest() throws InterruptedException {
    	
    	WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10000));
        WebElement Event = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"js-menu\\\"]/div/ul/li[2]/a")));
        Event.click();
    	Thread.sleep(8000);
        WebElement colonbutton=d.findElement(By.xpath("x//*[@id=\"all-tab\"]/div[1]/div/div[1]/div[2]/button/i"));
        colonbutton.click();
        
       
    }

    @AfterMethod  
    public void logout() throws InterruptedException {
        // Perform logout
    	
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10000));
        WebElement accountClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accountClick\"]/span")));
        accountClick.click();
        
        WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/nav/div/div[2]/ul/li[2]/ul/li[2]/a[2]")));
        logoutLink.click();
        d.quit();
    }
}
