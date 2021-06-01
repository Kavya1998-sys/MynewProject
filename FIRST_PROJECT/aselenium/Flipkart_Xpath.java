package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Xpath {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		//how to clear the password field in facebook page
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}