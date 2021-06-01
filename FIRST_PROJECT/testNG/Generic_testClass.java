package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Generic_testClass extends Generic {

	@Test
	public void fb_login()
	{
		driver.findElement(By.id("email")).sendKeys("8904907746");
		driver.findElement(By.id("pass")).sendKeys("Rakthacharita");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
