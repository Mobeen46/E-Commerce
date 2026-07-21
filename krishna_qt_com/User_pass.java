package krishna_qt_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_pass {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String ExpectedURL= "https://www.saucedemo.com/";
		String ActualURL = "https://www.saucedemo.com/";
		if(ExpectedURL.equalsIgnoreCase(ActualURL))
		{
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
		}
		else
		{
			System.out.println("this not demo");
		}
		

	}

}
