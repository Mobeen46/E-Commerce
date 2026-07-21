package com.java.mobeen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ramana_1 {
	WebDriver driver;
	public void Launch() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
public void tittle() {
	String tille=driver.getTitle();
	System.out.println(tille);
}
	public static void main(String[]args) throws InterruptedException {
		Ramana_1 obj=new Ramana_1();
		obj.Launch();
		obj.tittle();
		


	}

}