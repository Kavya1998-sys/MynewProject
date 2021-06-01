package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//script to maximize the browser
		System.setProperty("webdriver.gecko.driver", "D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//REsize the browser
		Dimension d= new Dimension(100,200);
		driver.manage().window().setSize(d);
		//script to drag the browser
		Point p= new Point(100,200);
		driver.manage().window().setPosition(p);
		
		

	}

}
