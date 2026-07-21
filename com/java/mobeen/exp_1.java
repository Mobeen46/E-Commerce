package com.java.mobeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp_1 {
	public void launchAUT() throws InterruptedException {
		//System.setProperty("webdriver.Chrome.driver","C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chromedriver-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));

        // Enter search text
        searchBox.sendKeys("Selenium WebDriver");

        // Submit search
        searchBox.submit();

        // Close browser
        driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		exp_1 n=new exp_1();
		n.launchAUT();
	}
}
 