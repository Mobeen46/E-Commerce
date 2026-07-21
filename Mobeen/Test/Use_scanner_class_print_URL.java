package Mobeen.Test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_scanner_class_print_URL {
	WebDriver driver;
	public void lauch() throws InterruptedException {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no");
		String src=s.nextLine();
		driver= new ChromeDriver();
		driver.get(src);
		Thread.sleep(200);
		driver.manage().window().maximize();
		
	}
	public void title(){
		String ss=driver.getTitle();
		System.out.println(ss);
		
	}

	public static void main(String[] args) throws InterruptedException {
		Use_scanner_class_print_URL aa=new Use_scanner_class_print_URL();
		aa.lauch();
		aa.title();
		

	}

}
