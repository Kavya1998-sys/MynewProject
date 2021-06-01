package aselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2 {

	public static void main(String[] args) {
		//go to amazon website and get the href ie.paths of all the anchor tags.
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> we = driver.findElements(By.tagName("a"));
		
		for(WebElement e:we)
		{
			 String attribute = e.getAttribute("href");
			 System.out.println(attribute);
		}

		

	}

}
