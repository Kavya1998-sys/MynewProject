package WEBELEMENT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create 10 checkboxes and check each of them and uncheck them in reverse order
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/check.html");
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		int s = list.size();
		for(WebElement i:list)
		{
			i.click();
		}
		//cannot uncheck using foreach hence must do with for
		for(int i=s-1;i>=0;i--){
			WebElement we = list.get(i);
			we.click();
			}
	}

}
