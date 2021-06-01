package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class options2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the text of all the options in a dropdown
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(ele);
		List<WebElement> option = s.getOptions();
		//int count=option.size();
		ArrayList<String>a=new ArrayList<String>();
		for(WebElement we:option)
		{
			
			String text = we.getText();
			a.add(text);
			//System.out.println(text);
			
		}
		Collections.sort(a,Collections.reverseOrder());
		for(String a1:a)
		{
			System.out.println(a1);
		}
		

	}

}
