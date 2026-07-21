package com.java.mobeen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {
	WebDriver driver;
	public void aa() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.findElement(By.id("username")).sendKeys("mobeenvali46@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.id("password")).sendKeys("Mobeen123@#");
		Thread.sleep(200);
		driver.findElement(By.id("Login")).click();
	}
	public void cc() throws IOException
	{
		File dd=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File ss=new File("C:\\Users\\K G T\\Desktop\\Navya//navyapotti.jpg");
		FileHandler.copy(dd, ss);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Screenshort bb=new Screenshort();
		bb.aa();
		bb.cc();

	}

}
