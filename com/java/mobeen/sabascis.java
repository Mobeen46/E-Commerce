package com.java.mobeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sabascis {
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com//");
	Thread.sleep(1);
	driver.manage().window();
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		sabascis hh=new sabascis();
		hh.LaunchAUT();
		

	}

}
