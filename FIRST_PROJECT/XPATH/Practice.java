package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/desktop/Desktop/Assignment.html");
		driver.findElement(By.id("a1")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		driver.findElement(By.linkText("forgot password")).click();

	}

}
