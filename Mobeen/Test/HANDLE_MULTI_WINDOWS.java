package Mobeen.Test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANDLE_MULTI_WINDOWS {
	WebDriver driver;
	public void lauch() throws InterruptedException{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no");
		int numb=s.nextInt();
		for(int i=0;i<numb;i++)
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(200);
			driver.manage().window().maximize();
			Thread.sleep(200);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HANDLE_MULTI_WINDOWS aa=new HANDLE_MULTI_WINDOWS();
		aa.lauch();

	}

}
