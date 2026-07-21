package com.java.mobeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil ch\\Desktop\\Drivers\\chromedriver-win64 (9)\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver ();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}
	public void getURL()
	{
		String act=driver.getCurrentUrl();
		String exp ="https://login.salesforce.com/?locale=in";
		if(act.equals(exp))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		GetURL oo=new GetURL();
		oo.LaunchAUT();
		oo.getURL();

	}

}
