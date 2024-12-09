package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Weddinginfo extends Repondez_Login {
	WebDriver driver;
	public void info() {
		//if (driver == null)
		//driver= new ChromeDriver();
	WebElement info = driver.findElement(
			By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/ul/li[1]/a/span[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(info).perform();
	WebElement details = driver.findElement(By.xpath("//*[@id=\"dash_guest\"]/li/ul/li[1]/a/span"));
	details.click();

	driver.findElement(By.id("reportrange")).click();

	String startDate = "5"; // Example: 15th of the month
	WebElement startDay = driver.findElement(By.xpath("//td[@class='available' and text()='" + startDate + "']"));
	startDay.click();
	//td[@class='available' and text()='" + startDate + "']"))
	// Select End Date
	String endDate = "6"; // Example: 20th of the month
	WebElement endDay = driver.findElement(By.xpath("//td[@class='available' and text()='" + endDate + "']"));
	endDay.click();
	
}
public static void main(String[] args) {
	Repondez_Login a= new Repondez_Login();
    a.login();
    
    Weddinginfo b = new Weddinginfo();
    b.info();
}
}
