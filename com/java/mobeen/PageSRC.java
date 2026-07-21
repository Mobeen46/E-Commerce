package com.java.mobeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSRC {
	WebDriver driver;
	public void LauntchAUT() throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
	public void pagesrc()
	{
		String src=driver.getPageSource();
		if(src.contains("label usernamelabel"))
		{
			System.out.println("Is avialable");
			}
		else
		{
			System.out.println("Is not avialable");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PageSRC aa=new PageSRC ();
		aa.LauntchAUT();
		aa.pagesrc();
	}
}
