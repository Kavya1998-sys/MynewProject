package multipleElementHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class No_of_links {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to count the number of links in a a webpage
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int count=ele.size();
		System.out.println(count);
}
}