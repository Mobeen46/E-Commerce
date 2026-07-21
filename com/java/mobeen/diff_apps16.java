package com.java.mobeen;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diff_apps16 {

	
	WebDriver driver;
	public void aa() throws InterruptedException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("please enter app name");
		String url=s.nextLine();
		if(url.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(url.equalsIgnoreCase("Edge"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Brower not open");
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class=\"slds-button slds-button--neutral onesetupCreateMenuTrigger\"]")).click();
		driver.findElement(By.linkText("Recruitment")).click();
		}
			

	public static void main(String[] args) throws InterruptedException {
		diff_apps16 oo=new diff_apps16();
		oo.aa();

	}

}
