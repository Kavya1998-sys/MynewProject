package CLICK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class id {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("E:\\desktop\\Desktop\\XPATH\\CLICK\\enter.html");
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
	}

}
