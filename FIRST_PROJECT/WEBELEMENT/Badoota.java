package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Badoota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Script to print all the options of the dropdown in ascending order
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/badoota.html");
		WebElement ele = driver.findElement(By.id("Badoota"));
		Select s= new Select(ele);
		s.selectByValue("i");
		s.selectByIndex(3);
		s.selectByValue("k");
		

	}

}
