package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class options {

	public static void main(String[] args) {
		//print the no of options in a dropdown
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		//driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		int count=options.size();
		System.out.println(count);
				
		
	}

}
