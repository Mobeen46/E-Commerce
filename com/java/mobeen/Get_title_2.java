package com.java.mobeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title_2 {
	WebDriver driver;
	public void LaunchAut() throws InterruptedException {
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
		Get_title_2 vv=new Get_title_2();
		vv.LaunchAut();
		vv.Gettitle();
		

	}

}
