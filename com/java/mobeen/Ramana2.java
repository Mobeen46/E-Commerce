package com.java.mobeen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ramana2 {
	WebDriver driver;
	
		public void aa() throws InterruptedException
		{
			driver= new ChromeDriver();
			driver.get("http://183.82.106.55:9093/");
			Thread.sleep(200);
			driver.manage().window().maximize();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='outlined-basic']")).sendKeys("9550735089");
			Thread.sleep(200);
			driver.findElement(By.xpath("//button[@class='btn btn-success rounded fw-bold shadow mt-2 mx-1 ms-3 py-2']")).click();
			Thread.sleep(200);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='text-danger']"))); // Adjust the locator as needed
	        // Retrieve the text from the element
	        String copiedText = textElement.getText();
	        System.out.println("Copied Text: " + copiedText);
	         WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]")));
	         otpField.sendKeys(copiedText);
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//a[@class=' text-decoration-none ']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//input[@id='outlined-textarea']")).sendKeys("1000000");
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//input[@name='squareFeet']")).sendKeys("102");
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//input [@name='pincode']")).sendKeys("521333");
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//select[@class='ms-lg-2 ms-3 py-2 px- fw-bold bg-light text-center']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//option[@value='5 to 10 Years']")).click();
	         Thread.sleep(200);
	         WebElement ok1 = driver.findElement(By.name("effected"));
	 		Select slcobj1=new Select(ok1);
	 		slcobj1.selectByValue("No");
	         Thread.sleep(200);
	         }
	         public void data() throws InterruptedException {
	        	 
	         
	         WebElement select=driver.findElement(By.xpath("//select[@name='security']"));
	         Select aaa=new Select(select);
	         aaa.selectByIndex(2);
	         Thread.sleep(200);
	         WebElement select1=driver.findElement(By.xpath("//select[@class='px-3 ms-3 py-2 fw-bold bg-light']"));
	         Select bbb=new Select(select1);
	         bbb.selectByIndex(1);
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//button[@class='btn btn-primary mt-5 fs-5 px-5 fw-bold']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button' and @data-value='3']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath(" //button[@class='btn btn-primary rounded buy shadow fw-bold']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//input[@class='ps-2 fw-bold col-lg-7 col-md-7 col-10']")).sendKeys("9550735089");
	         Thread.sleep(200);
	         driver.findElement(By.xpath("//button[@class='btn btn-success rounded fw-bold shadow  mx-1 ms-2 py-2']")).click();
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='text-danger']"))); // Adjust the locator as needed
		     String copiedText = textElement.getText();
		     System.out.println("Copied Text: " + copiedText);
		     WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
		     otpField.sendKeys(copiedText);
		     Thread.sleep(200);
		     driver.findElement(By.xpath("//button[@class='btn btn-info text-nowrap fw-bold shadow ms-1']")).click();
		     Thread.sleep(200);
		     driver.findElement(By.xpath("//select[@class='form-select ms-3 p-2 fw-semibold bg-light text-secondary']")).click();
		     Thread.sleep(200);
//		     driver.findElement(By.xpath("//option[@value='Mr']")).click();
//		     Thread.sleep(200);
//		     driver.findElement(By.name("pancard")).sendKeys("DGFSG1234H");
//		     Thread.sleep(200);
//		     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/input")).sendKeys("mobeenvali46@gmail.com");
//		     Thread.sleep(200);
		     driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input']")).sendKeys("2-103");
		     Thread.sleep(200);
		     driver.findElement(By.name("propertystreetNo")).sendKeys("jjajja");
		     Thread.sleep(200);
		     driver.findElement(By.name("propertycity")).sendKeys("hyd");
		     Thread.sleep(200);
		     driver.findElement(By.name("propertystate")).sendKeys("Andhra");
		     Thread.sleep(200);
		     WebElement select3=driver.findElement(By.name("currentaddress"));
	         Select ddd=new Select(select3);
	         ddd.selectByIndex(1);
	         Thread.sleep(200);
	         driver.findElement(By.xpath(" //button[@class='btn btn-primary mt-3 fw-bold buy mb-3 shadow']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath(" //button[@class='btn btn-primary mx-3 py-2 fw-bold buy mb-2 text-nowrap']")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath(" //div[@class='relative flex min-h-12 cursor-pointer items-center gap-3 px-4 py-3 focus:border-on-surface focus:border-opacity-10 d:gap-4 d:py-4 !px-2 text-on-surface transition-all hover:rounded-lg hover:bg-surface peer-checked:bg-surface '][1]")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[@class='relative flex min-h-12 cursor-pointer items-center gap-3 px-4 py-3 focus:border-on-surface focus:border-opacity-10 d:gap-4 d:py-4 !px-2 text-on-surface transition-all hover:rounded-lg hover:bg-surface peer-checked:bg-surface bg-surface']")).click();
	         Thread.sleep(2000);
			 //driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Ramana2 bb=new Ramana2();
		bb.aa();
		bb.data();

	}

}
