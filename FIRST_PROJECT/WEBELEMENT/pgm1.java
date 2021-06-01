package WEBELEMENT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//Print the text of all the  link elements using foreach loop in amazon website
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> we = driver.findElements(By.xpath("//a"));
		for(WebElement i:we)
		{		
			String text=i.getText();
			System.out.println(text);
		
		}
		

	}

}
