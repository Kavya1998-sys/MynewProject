package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//scxript to get the text of the link of New Release  in amazon
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45']"));
		String text=ele.getText();
		System.out.println(text);
		
		

	}

}
