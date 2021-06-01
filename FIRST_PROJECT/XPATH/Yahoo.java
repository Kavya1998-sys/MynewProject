package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Kavya_1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Siddappaji@1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.xpath("//span[.='Mail']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("kavya_1998@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("This is a test mail");
		driver.findElement(By.xpath("//div[@class='rte em_N ir_0 iy_A iz_h N_6Fd5']")).sendKeys("Hi This is a test mail");
		//driver.findElement(By.xpath("//button[@title='Attach files']")).click();
		//driver.findElement(By.xpath("//span[.='Attach files from computer']")).click();
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	}

}
