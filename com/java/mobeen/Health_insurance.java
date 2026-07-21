package com.java.mobeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Health_insurance {
	WebDriver driver;
	public void aa() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("http://183.82.106.55:9101/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success mx-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("phoneNumber")).sendKeys("9550735089");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Send OTP\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='text-success']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Mobeen Kalidindi");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Mobeenvali46@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Send OTP\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("phoneNumber1")).sendKeys("9550735089");
	}
	public static void main(String[] args) throws InterruptedException {
		Health_insurance bb=new Health_insurance();
		bb.aa();

	}

}
