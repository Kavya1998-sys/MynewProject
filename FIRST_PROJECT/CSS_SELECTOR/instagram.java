package CSS_SELECTOR;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.instagram.com/accounts/login/");
			/*WebElement ele=driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
			ele.click();*/
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
			
			ele.click();

	}
}
