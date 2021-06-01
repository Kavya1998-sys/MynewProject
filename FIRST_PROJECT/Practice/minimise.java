package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class minimise {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method
		//script to minimise the browser and open the same browser
		//we can minimise the browser manually we can click on the ALT+SPACE+N
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.facebook.com/r.php");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);


		//r.keyPress(KeyEvent.VK_ALT+KeyEvent.VK_SPACE+KeyEvent.VK_N);

		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		

		

	}

}
