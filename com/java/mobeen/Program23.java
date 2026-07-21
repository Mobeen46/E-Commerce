package com.java.mobeen;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program23 {
	WebDriver driver;
	public void aa() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(200);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Wait()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));//------------>Explicity wait
		 WebElement ff = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Red Tape, Wildcraft..']")));
		 ff.click();	
	}

	public static void main(String[] args) throws InterruptedException {
		Program23 bb= new Program23();
		bb.aa();
		bb.wait();
	}

}
