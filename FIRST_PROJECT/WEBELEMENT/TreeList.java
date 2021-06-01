package WEBELEMENT;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sort the elements by using the treelist 
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium_assignment/badoota.html");
		WebElement ele = driver.findElement(By.id("Badoota"));
		Select s= new Select(ele);
		List<WebElement> option = s.getOptions();
		/*int count = option.size();
		System.out.println(count);*/
		TreeSet<String> a=new TreeSet<String>();
		for(WebElement e:option)
		{
			String text = e.getText();
			a.add(text);
			
		}
		for(String tree:a)
		{
			System.out.println(tree);
		}
		
		
		
		

	}

}
