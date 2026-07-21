package krishna_qt_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks_types {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(doubleclick).build().perform();	
		Thread.sleep(2000);

		}

}
