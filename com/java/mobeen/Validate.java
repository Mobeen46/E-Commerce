package com.java.mobeen;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate {
	WebDriver driver;
		public void LauntchAUT() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
			driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
		}
		public void validate()
		{
			String data=driver.getTitle();
			String exp="welcom to amozan";
			if(data.equalsIgnoreCase(exp))
			{
				System.out.println("Both are same");
			}
			else
			{
				System.out.println("Both are not same");
			}
		}
	public static void main(String[] args) throws InterruptedException {
		Validate oo=new Validate();
		oo.LauntchAUT();
		oo.validate();
	}
}
