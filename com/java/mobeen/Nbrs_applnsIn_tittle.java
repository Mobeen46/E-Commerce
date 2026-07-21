package com.java.mobeen;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nbrs_applnsIn_tittle {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter exp url");
		String url=s.nextLine();
		System.out.println("please enter expected title");
		String exp=s.nextLine();
		//System.setProperty(webdriver.chrome.driver, "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
		driver=new ChromeDriver ();
		driver.get("https://app.startinfinity.com/home");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String act_title=driver.getTitle();
		System.out.println(act_title);
		if(exp.equalsIgnoreCase(act_title))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Nbrs_applnsIn_tittle aa=new Nbrs_applnsIn_tittle();
		aa.LaunchAUT();
	}
}
