package multipleElementHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class text_of_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to count the number of links in a a webpage and get the text of all the links
				System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.amazon.in");
				List<WebElement> ele = driver.findElements(By.tagName("a"));
				int count=ele.size();
				/*for(int i=0;i<count;i++)
				{
					WebElement index = ele.get(i);
					String text = index.getText();
					System.out.println(text);
				}
				*/
				//using foreach loop
				for(WebElement e:ele)
				{
					String text = e.getText();
					System.out.println(text);
				}

	}

}
