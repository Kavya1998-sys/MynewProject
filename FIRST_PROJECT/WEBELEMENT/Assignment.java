package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("D:\\selenium_assignment\\t.html");
		WebElement ele= driver.findElement(By.xpath("//input[@value='abc']"));
		ele.sendKeys(Keys.CONTROL+"ac");
		WebElement ele1=driver.findElement(By.xpath("//input[@value='xyz']"));
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"v");


	}

}
