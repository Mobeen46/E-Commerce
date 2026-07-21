package com.java.mobeen;

import java.awt.Desktop.Action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {
	private static final char[] H = null;
	WebDriver driver;
	public void gaga() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	}
			public void fafa(String username,String password) throws InterruptedException 
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

				driver.findElement(By.name("username")).sendKeys(username);
				
				driver.findElement(By.name("password")).sendKeys(password);
			
				driver.findElement(By.xpath("//button[@type='submit']")).click();
		
				driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[5]/a/span")).click();
			
				//driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
				driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("Mobeen");
				driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']")).sendKeys("kalidindi");
				driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("ka");
				driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();

				driver.findElement(By.xpath("//span[text()='Senior QA Lead']")).click();
				driver.findElement(By.xpath("(//div[@class=\"oxd-form-row\"]/descendant::input[@placeholder=\"Type here\"])[1]")).sendKeys("mobeenvali@gmail.com");
				driver.findElement(By.xpath("(//div[@class=\"oxd-form-row\"]/descendant::input[@placeholder=\"Type here\"])[2]")).sendKeys("9494949494");
				//driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("shortcut");
				//driver.findElement(By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
				//notes
				
				  driver.findElement(By. xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("place write your note"); 
				  driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
				  //driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();
				  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); 
				  driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click(); 
				 driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']")).sendKeys("23110110015");				 
			driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("((//div[@tabindex='0'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Qwerty LName");
			driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
			driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys("Enable");
			 

			//<span data-v-7b563373="" data-v-6475d26d="" class="oxd-text oxd-text--span oxd-main-menu-item--name">Time</span>
			//<span data-v-7b563373="" data-v-6475d26d="" class="oxd-text oxd-text--span oxd-main-menu-item--name">Leave</span>
			
				
			
			}
//			public void list(){
//				List<WebElement> Headelinks=driver.findElements(By.tagName("span"));
//				 int AA=Headelinks.size();
//				System.out.println(AA);
//}
							
	public static void main(String[] args) throws InterruptedException {
		
		OrangeHRM aa=new OrangeHRM();
		aa.gaga();
		aa.fafa("Admin","admin123");
		//aa.list();

	}
		
}
