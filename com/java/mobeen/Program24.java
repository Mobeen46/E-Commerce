package com.java.mobeen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program24 {
	WebDriver driver;
	Actions bb;
	public void aa()
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	public void cc() throws InterruptedException
	{
		WebElement dd= driver.findElement(By.className("Pke_EE"));
		bb=new Actions(driver);
		bb.sendKeys(dd,"java").perform();
		for(int i=0;i<5;i++)
		{
			bb.sendKeys(Keys.DOWN).perform();
			Thread.sleep(200);
		}
		bb.sendKeys(Keys.ENTER).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		Program24 bb=new Program24();
		bb.aa();
		bb.cc();

	}

}
