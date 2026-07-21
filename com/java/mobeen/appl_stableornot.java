package com.java.mobeen;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class appl_stableornot {
	 WebDriver driver;
	 public void Loop_url()
	 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter no of times");
	 int count =sc.nextInt();
	 for(int i=0;i<count;i++)
	 {
	 driver = new ChromeDriver();
	 driver.get("https://login.salesforce.com/");
	 driver.manage().window().maximize();
	 sc.close();
	 }
	 }

	 public static void main(String[] args) {
		 appl_stableornot obj1= new appl_stableornot();
	 obj1.Loop_url();
	 }
	 }

