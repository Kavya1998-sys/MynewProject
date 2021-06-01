package aselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestCase1--->Craete 10 textboxes and enter your name in very textbox and clear those names using foreach loop
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/textbox.html");
		List<WebElement> we = driver.findElements(By.tagName("input"));
		for(WebElement e:we)
		{
			  e.clear();
		}

	}

}
