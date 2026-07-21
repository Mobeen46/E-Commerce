package krishna_qt_com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement firstName=driver.findElement(By.id("textbox"));
		js.executeScript("window.scrollBy(0,500)");

		//js.executeScript("arguments[0].click():",secondName) ;
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(firstName).click().build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.SHIFT).sendKeys("Mobeen").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(2000);
		WebElement secondName=driver.findElement(By.id("textbox"));
		js.executeScript("window.scrollBy(0,500)");
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(2000);
		WebElement Paste=driver.findElement(By.id("pdfbox"));
		js.executeScript("arguments[0].click();",secondName) ;
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(Paste).click().build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		action.moveToElement(Paste).click().build().perform();
		Thread.sleep(2000);
	}
	

}
