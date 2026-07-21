package com.java.mobeen;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gorilla {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("please enter expected number");
		int count=s.nextInt();
		for(int i=0;i<count;i++)
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
			driver=new  ChromeDriver();
			driver.get("https://noysi.com/a/#/teams/ramanasoft-internship/channels/testing_202_batch/chat");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			Thread.sleep(30);
			
			driver.close();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		gorilla aa=new gorilla();
		aa.LaunchAUT();
	}
}
