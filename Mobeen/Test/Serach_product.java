package Mobeen.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Serach_product {
	WebDriver driver;
	public void lauch() throws InterruptedException 
	{
		
		driver= new ChromeDriver ();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		Thread.sleep(2000);
	}
	public void lauch2() throws InterruptedException
	{

		driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='form-select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Name (A - Z)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='HTC Touch HD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(200000);
//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-inverse btn-block dropdown-toggle']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa-solid fa-cart-shopping']")).click();
		Thread.sleep(2000);
		

		
		
		

	}

	public static void main(String[] args) throws InterruptedException {
		Serach_product aa=new Serach_product();
		aa.lauch();
		aa.lauch2();

	}

}
