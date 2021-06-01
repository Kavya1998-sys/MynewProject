package multipleElementHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//script to count the number of links in a a webpage
				System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("file:///D:/selenium_assignment/mainpage.html");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("abc");
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("xyz");
				driver.switchTo().frame(0);
				WebElement e = driver.findElement(By.tagName("a"));
				driver.findElement(By.xpath("//a[.='google']")).click();
				 /*Actions act = new Actions(driver);
				 act.contextClick(e).perform();
				 Thread.sleep(2000);
				 Robot r = new Robot();
				 r.keyPress(KeyEvent.VK_T);
				 r.keyRelease(KeyEvent.VK_T);
				 Thread.sleep(4000);*/
				
				String url=driver.getCurrentUrl();
				String title = driver.getTitle();
				System.out.println(url);
				//driver.switchTo().defaultContent();
				//String title = driver.getTitle();
				System.out.println(title);
				

				
				
	}

}
