package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to check if the checkbox is checked
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/checkbox.html");
		WebElement e = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean select = e.isSelected();
		if(select)
		{
			System.out.println("checkbox selected");
		}
		else
		{
			System.out.println("checkbox not selected");
		}

	}

}
