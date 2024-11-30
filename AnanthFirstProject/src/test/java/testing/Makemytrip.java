package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {
	WebDriver d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver d= new ChromeDriver();
d.get("https://www.makemytrip.com/");
WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
WebElement close = wait
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span")));
			close.click();




	}

}
