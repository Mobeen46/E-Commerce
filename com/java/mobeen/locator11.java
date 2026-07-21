package com.java.mobeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator11 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
		driver=new ChromeDriver ();
		driver.get("https://ramanasoft-d-dev-ed.develop.my.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(30);
        driver.findElement(By.id("username")).sendKeys("mobeenvali46@gmail.com");
        Thread.sleep(2002);
        driver.findElement(By.id("password")).sendKeys("Mobeen123@#");
        Thread.sleep(2000);
        driver.findElement(By.id("Login")).click();        
	}
	public static void main(String[] args) throws InterruptedException {
		locator11 aa=new locator11();
		aa.LaunchAUT();
	}
}
