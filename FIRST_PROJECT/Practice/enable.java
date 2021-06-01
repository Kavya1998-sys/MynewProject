package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check of the textbox is enabled
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/display.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));
		boolean enable=ele.isEnabled();
		if(enable)
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}


	}

}
