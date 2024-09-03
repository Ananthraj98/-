package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("https://ticketdev.chkdin.com/organiser/login");
		d.findElement(By.name("email")).sendKeys("ananthraj@chkdin.com");
		d.findElement(By.name("password")).sendKeys("123456789");
		d.findElement(By.className("main-btn")).click();
		//System.out.println(d.getTitle()); 
		System.out.println(d.getCurrentUrl()); 


	}

}
