package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class INSTA_LOGIN {
	
	//login script for instagram login using POM and testng

	@FindBy(xpath="//button[@type='button']")
	private WebElement loginbtn1;
	
	@FindBy(id="email")
	private WebElement un;
	@FindBy(id="pass")
	private WebElement pw;
	@FindBy(id="loginbutton")
	private WebElement loginbtn2;
	@FindBy(xpath="//div[@class='J_0ip  Vpz-1  TKi86 ']")
	private WebElement messages;
	
	
	public INSTA_LOGIN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin1()
	{
		loginbtn1.click();
	}
	public void sendun(String u)
	{
		un.sendKeys(u);
	}
	public void sendpass(String p)
	{
		pw.sendKeys(p);
	}
	public void clicklogin2()
	{
		loginbtn2.click();
	}
	public void sendmessage()
	{
		messages.click();
	}
	

}

