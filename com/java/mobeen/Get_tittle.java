package com.java.mobeen;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_tittle {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver.", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Gettitle()
	{
		String data=driver.getTitle();
		System.out.println(data);
	}
	public static void main(String[] args) throws InterruptedException {
		Get_tittle oo=new Get_tittle();
		oo.LaunchAUT();
		oo.Gettitle();
	}
}
