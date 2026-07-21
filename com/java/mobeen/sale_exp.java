package com.java.mobeen;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
public class sale_exp {
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(5);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.close();
	}
	public static void main(String[] args) throws InterruptedException { 
		sale_exp obj=new sale_exp(); 
	    obj.LaunchAUT();
}}