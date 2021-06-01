package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select_de {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//script to select few options in a dropdown and deselect all
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/macdonalds.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='McDonalds']"));
		Select s=new Select(ele);
		//s.selectByIndex(3);
		Thread.sleep(2000);
		//s.selectByVisibleText("Beverages");
		//Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("Beverages");
		Thread.sleep(2000);
		s.deselectAll();

	}

}
