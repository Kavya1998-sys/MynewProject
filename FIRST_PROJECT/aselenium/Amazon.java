package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("kavyansskv@gmail.com");
		driver.findElement(By.cssSelector("span[id='continue']")).click();
		driver.findElement(By.cssSelector("span[class='a-button a-button-span12 a-button-base']")).click();
		driver.findElement(By.cssSelector("input[class='a-input-text a-span12 cvf-widget-input cvf-widget-input-code']")).sendKeys("752965");
		driver.findElement(By.cssSelector("span[class='a-button a-button-span12 a-button-primary cvf-widget-btn cvf-widget-btn-verify']")).click();
		
	}

}

