package Enter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\chromedriver_1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\\\desktop\\\\Desktop\\\\XPATH\\\\ENTER\\\\tagname.html");
		driver.findElement(By.id("a1")).click();
		

	}

}
