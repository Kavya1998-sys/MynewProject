package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/maps/@21.125498,81.914063,5z");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='searchbox-directions']")).click();
		
		driver.findElement(By.xpath("//div[@class='searchbox ']")).sendKeys("Mysore");
		
	}

}
