package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repondez_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver d=new ChromeDriver();
d.get("https://repondez.staging.chkdin.com/console/277/guestlist");
WebElement a= d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/ul/li[1]/a"));
a.click();

}

}
