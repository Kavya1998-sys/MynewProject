package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to handle  tooltip or print the attribute value of an element
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//WebElement ele = driver.findElement(By.xpath("//a[@title='Kannada']"));
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String attr=ele.getAttribute("title");
		System.out.println(attr);

	}
}


