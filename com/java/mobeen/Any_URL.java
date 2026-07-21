package com.java.mobeen;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Any_URL {
	WebDriver driver;
		public void LaunchAUT() throws InterruptedException
		{
		Scanner s=new Scanner (System.in);
		System.out.println("please enter expected url's"); //http://183.82.106.55:9093/
		String url=s.nextLine();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(30);
		driver.close();
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Any_URL aa=new Any_URL();
		aa.LaunchAUT();
	}
}
