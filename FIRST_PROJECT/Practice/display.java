package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class display {

	public static void main(String[] args) {
		//check of the textbox is displayed
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/display.html");
		//WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));
		WebElement ele=driver.findElement(By.xpath("//input[@value='abc']"));
		 boolean text = ele.isDisplayed();
		 if(text)
		 {
			 System.out.println("textbox is displayed");
		 }
		 else
		 {
			 System.out.println("textbx is not displayed");
		 }

	}

}
