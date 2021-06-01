package CSS_SELECTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb_practice {

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8904907746");
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("siddappajihowdu");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
}
}
