package CLEAR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("E:\\desktop\\Desktop\\XPATH\\ENTER\\enter.html");
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		driver.findElement(By.tagName("input")).clear();

	}

}
