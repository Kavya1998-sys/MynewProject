package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class INSTA_POM {

	@Test
	public void implementation() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		INSTA_LOGIN in=new INSTA_LOGIN(driver);
		in.clicklogin1();
		Thread.sleep(2000);
		in.sendun("8904907746");
		Thread.sleep(1000);
		in.sendpass("Rakthacharith");
		Thread.sleep(3000);
		in.clicklogin2();
		in.sendmessage();
				
				
		
		
		
	}

}

