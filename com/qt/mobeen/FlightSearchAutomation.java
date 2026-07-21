package com.qt.mobeen;

	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	

	import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
	import java.util.concurrent.TimeUnit;

	public class FlightSearchAutomation {

	    public static void main(String[] args) {
	       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\K G T\\Downloads\\chromedriver-win64\\chrome.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	        try {
	            driver.get("https://www.spicejet.com/");
	            WebElement oneWayRadioButton = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']"));
	            oneWayRadioButton.click();
	            WebElement fromCity = driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
	            fromCity.click();
	            //from
                WebElement delhiOption = driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']"));
	            delhiOption.click();
	            //to
	           WebElement toCity = driver.findElement(By.xpath("//div[text()='Rajiv Gandhi International Airport']"));
	            toCity.click();
	            //date
	            WebElement hyderabadOption = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"));
		        hyderabadOption.click();
		        //Passenger
		       WebElement Passenger = driver.findElement(By.xpath("//div[text()='Passengers']"));
		        Passenger.click();
		        //Adults
		        WebElement number = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		        number.click();
		        //child
		        WebElement child = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		        child.click();
		        WebElement done = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"));
	            done.click();
		      
		        WebElement submit = driver.findElement(By.xpath("//div[@style='background-image: linear-gradient(rgb(252, 182, 62), rgb(247, 148, 29)); margin-right: 12px; margin-top: -2px; width: 162px;']"));
		        submit.click();
		        WebElement next = driver.findElement(By.xpath("//div[text()='Next Day']"));
		        next.click();
		      
	            if (submit.isDisplayed()) 
	            
		        {
	                System.out.println("Search results are displayed successfully.");
	            } 
		        else {
	                System.out.println("Search results are NOT displayed.");
	            }


	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	          // driver.quit(); 
	           
	        }
	        }
	}


