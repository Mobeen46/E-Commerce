package com.java.mobeen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class SignUp {
	WebDriver driver;
	public void aa() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://example.com"); // Replace with your URL

	        // Locate input field using XPath
	        WebElement inputField = driver.findElement(By.xpath("//input[@id='username']"));

	        // Clear the field and type something
	        inputField.sendKeys("Testing");

	        // Use BACKSPACE key to remove the last character
	        inputField.sendKeys(Keys.BACK_SPACE);
	}
		       
		/*
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(200);
		driver.manage().window().maximize();
		driver.findElement(By.id("signup_link")).click();
		Thread.sleep(200);
		driver.findElement(By.name("UserFirstName")).sendKeys("kalidindi");
		Thread.sleep(200);
		driver.findElement(By.name("UserLastName")).sendKeys("Mobeen");
		Thread.sleep(200);
		driver.findElement(By.name("UserEmail")).sendKeys("mobeenvali46@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
		Thread.sleep(200);
		driver.findElement(By.name("CompanyName")).sendKeys("Quality");
		Thread.sleep(200);
		driver.findElement(By.name("CompanyEmployees")).sendKeys("1 - 25 employees");
		Thread.sleep(200);
		driver.findElement(By.name("UserPhone")).sendKeys("9550735089");
		Thread.sleep(200);
		driver.findElement(By.name("CompanyCountry")).sendKeys("India");
		Thread.sleep(200);
		driver.findElement(By.name("CompanyState")).sendKeys("Andhra Pradesh");
		Thread.sleep(200);
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
		Thread.sleep(200);
		driver.findElement(By.name("start my free trial")).click();
		
*/
	
	public static void main(String[] args) throws InterruptedException {
		SignUp bb=new SignUp();
		bb.aa();
		

	}

}
