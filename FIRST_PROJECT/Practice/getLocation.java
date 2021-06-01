package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to get the location of Kannada element
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//WebElement ele = driver.findElement(By.xpath("//a[@title='Kannada']"));
		WebElement el=driver.findElement(By.xpath("//a[@title='Kannada']"));
		Point p=el.getLocation();
		System.out.println(p);
		//to get the x and y axis separately
		int x=p.getX();
		int y=p.getY();
		System.out.println(x+' '+y);

	}

}
