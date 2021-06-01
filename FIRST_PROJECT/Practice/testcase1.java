package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/text.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement e:ele)
		{
			e.clear();
		}
	}

	
}
