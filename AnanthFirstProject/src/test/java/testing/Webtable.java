package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
WebDriver d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver d=new ChromeDriver();
	      d.get("http://demo.guru99.com/test/web-table-element.php");
	      List<WebElement>column =d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	      System.out.println("No of columns are:" +column.size());

	}

}
