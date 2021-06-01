package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPATH_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//div[@id='browsersExpand']")).click();
		driver.findElement(By.xpath("//a[@href='https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html']")).click();
		//driver.findElement(By.id("pass")).sendKeys("siddappajihowdu");
		//driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("siddappajihowdu");
		//driver.findElement(By.cssSelector("button[id='loginbutton']")).click();

	}

}
