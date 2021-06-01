package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\\\ECLIPSE_SELENIUM\\\\FIRST_PROJECT\\\\SELENIUM\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=124024574287414&kid_directed_site=0&app_id=124024574287414&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Foauth%3Fclient_id%3D124024574287414%26redirect_uri%3Dhttps%253A%252F%252Fwww.instagram.com%252Faccounts%252Fsignup%252F%26state%3D%257B%2522fbLoginKey%2522%253A%25221ma6mshufapo8ce1l9gskrdwpviev0w1lt4rchm8dd82zznxwv%2522%252C%2522fbLoginReturnURL%2522%253A%2522%252F%2522%257D%26scope%3Demail%26response_type%3Dcode%252Cgranted_scopes%26locale%3Den_US%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3D8f841a59-4bad-436a-af32-760e474af1cc%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fsignup%2F%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3D%257B%2522fbLoginKey%2522%253A%25221ma6mshufapo8ce1l9gskrdwpviev0w1lt4rchm8dd82zznxwv%2522%252C%2522fbLoginReturnURL%2522%253A%252"
				+ "2%252F%2522%257D%23_%3D_&display=page&locale=en_GB&pl_dbl=0");
		driver.findElement(By.id("email")).sendKeys("8904907746");
		driver.findElement(By.id("pass")).sendKeys("siddappajihowdu");
		//driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("siddappajihowdu");
		driver.findElement(By.cssSelector("button[id='loginbutton']")).click();
		

	}

}
	