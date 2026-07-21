package krishna_qt_com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WbElet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		WebElement FirstName=driver.findElement(By.tagName("input"));
		FirstName.sendKeys("Mobeen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("k");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("sdvhsvd,\nhshshs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sdvhsvd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("863862");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement MaleClick=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		if(MaleClick.isDisplayed()&& MaleClick.isSelected()&& MaleClick.isEnabled())
		{
			MaleClick.click();
			Thread.sleep(2000);
		}
		else
		{
			MaleClick.click();
			System.out.println("MaleClick");
		}
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Hockey\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style=\"min-height:30px;max-width:200px\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("Mobeen");
		Thread.sleep(2000);
		//driver.findElement(By.id("Skills")).click();
		//Thread.sleep(2000);
		WebElement skills=driver.findElement(By.id("Skills"));
		Select skill= new Select(skills);
		skill.selectByValue("Design");
		//driver.findElement(By.xpath("//option[text()='Analytics']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("countries")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		Thread.sleep(2000);
		//WebElement India = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		//India.sendKeys("India");
		Thread.sleep(5000);
				
		driver.close();
		
		

	}

}
