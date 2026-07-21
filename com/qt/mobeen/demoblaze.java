package com.qt.mobeen;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class demoblaze {
	WebDriver driver;
	public void lach() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chromedriver-win64\\chrome.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 Thread.sleep(200);
		 driver.manage().window().maximize();
	}
	public void Senddata() throws InterruptedException
	{
		
	driver.findElement(By.xpath("//a[text()='Laptops']")).click();
	driver.findElement(By.id("cat")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		demoblaze aa=new demoblaze();
		aa.lach();
		
		
	}

}
