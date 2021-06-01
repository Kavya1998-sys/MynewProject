package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to clear the default data inside a textbox without using clear()
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/display.html");
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.DELETE);

	}

}
