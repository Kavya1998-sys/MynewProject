package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//go to amazon website and get the path of all images
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> ele = driver.findElements(By.xpath("//img"));
		for(WebElement e:ele)
		{
			String attr = e.getAttribute("src");
			System.out.println(attr);
		}
		
		
		

	}

}
