package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\\\\\\\\\FIRST_PROJECT\\\\\\\\\\\\\\\\SELENIUM\\\\\\\\\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGF trailer");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//a[@href='/watch?v=-KfsY-qwBS0']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[.='644K']")).click();
		
		
	}

}
