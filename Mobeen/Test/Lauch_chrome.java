package Mobeen.Test;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch_chrome {
	WebDriver driver;
	public void lauch() throws InterruptedException {
		driver=new ChromeDriver();
		//2.LAUNCH URL
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		//LAUNCH URL & MAXIMIZE
		driver.manage().window().maximize();
		//4.COMPARE TITLE
	}
	public void title() {
		String data=driver.getTitle();
		System.out.println(data);
		String expect="Facebook – log in or sign up";
		if(data.equalsIgnoreCase(expect))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Lauch_chrome aa=new Lauch_chrome();
		aa.lauch();
		aa.title();

	}

}
