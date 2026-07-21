package krishna_qt_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement ok= driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));		
		ok.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		/*String pop=driver.switchTo().alert().getText();
		System.out.println("alenrt"+pop);
		driver.switchTo().alert().accept(); */
		WebElement OKcancel= driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));		
		OKcancel.click();
		Thread.sleep(2000);
		WebElement confirm= driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));		
		confirm.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//String pop1=driver.switchTo().alert().getText();
		//System.out.println("pop1"+pop1);
		//Thread.sleep(2000);
		driver.close();
		

	}

}
