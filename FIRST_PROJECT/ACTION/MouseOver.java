package ACTION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Script to perform mouse over action on fashion in flipkart website
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.xpath("//div[.='Fashion'])[2]"));
		WebElement e = driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		
		

	}

}
