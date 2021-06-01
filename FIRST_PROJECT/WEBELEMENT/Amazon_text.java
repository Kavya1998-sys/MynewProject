package WEBELEMENT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\ECLIPSE_SELENIUM\\\\\\\\FIRST_PROJECT\\\\\\\\SELENIUM\\\\\\\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMI8M-p9uXe7wIVjLaWCh31nwWCEAAYASAAEgJNEvD_BwE_k_&ext_vrnc=hi&g"
				+ "clid=EAIaIQobChMI8M-p9uXe7wIVjLaWCh31nwWCEAAYASAAEgJNEvD_BwE&network=g");
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement we=links.get(i);
			String text=we.getText();
			 System.out.println(text);
		}
		

	}

}
