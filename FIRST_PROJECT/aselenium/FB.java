package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\chromedriver_1.exe");
		WebDriver driver=new ChromeDriver();
		//D:\\ECLIPSE_SELENIUM\\FIRST_PROJECT\\SELENIUM\\chromedriver.exe
		///FIRST_PROJECT/SELENIUM/chromedriver.exe
		//C:\\Users\\hp\\chromedriver.exe
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("jhljhk");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("jhljhk");
		driver.findElement(By.cssSelector("button[name='login']")).click();

		
	}

}
