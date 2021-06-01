package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/badoota.html");
		WebElement ele = driver.findElement(By.id("Badoota"));
		Select s= new Select(ele);
		List<WebElement> option = s.getOptions();
		int count=option.size();
		System.out.println(count);
		ArrayList<String> al=new ArrayList<String>();
		//to get teh text 
		for(WebElement we:option)
		{
			String text = we.getText();
			al.add(text);
			
		}
		Collections.sort(al);
		for(String a:al)
		{
			System.out.println(a);
		}
		
		

	}

}
