package com.java.mobeen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_box {
	
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();		
	}
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby oil's");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-text")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		Search_box obj=new Search_box();
		
		obj.LaunchAUT();
		obj.Senddata();
	}
}
