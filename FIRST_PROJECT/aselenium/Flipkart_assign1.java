package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[.='Grocery' and @class='xtXmba']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Add Item'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Add Item'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Add Item'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Add Item'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Add Item'])[5]")).click();



		
		
	}

}
