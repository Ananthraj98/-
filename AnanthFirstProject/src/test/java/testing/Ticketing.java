package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ticketing {

	 d = new ChromeDriver();
     d.get("https://ticketdev.chkdin.com/sales-report");
     // Perform login
     d.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/input")).sendKeys("ananthraj@chkdin.com");
     d.findElement(By.id("user-password")).sendKeys("123456789");
     d.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
 }
}
