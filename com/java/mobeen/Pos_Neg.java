package com.java.mobeen;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pos_Neg {
	WebDriver driver;
	public void aa() throws InterruptedException
	{
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chromedriver-win64\\chrome.exe");

		driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 }
		 public void P_N(String username, String password) throws InterruptedException
		 {
		 driver.findElement(By.id("username")).sendKeys(username);
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys(password);
		 Thread.sleep(2000);
		 driver.findElement(By.id("Login")).click();
		 }
		 public static void main(String[] args) throws InterruptedException {
			 Pos_Neg obj =new  Pos_Neg();
		 obj.aa();
		 obj.P_N("gunasagar@gmail.com","sagar@123"); 
		 obj.P_N("yella@gmail.com","yella123"); 
		 }
}
