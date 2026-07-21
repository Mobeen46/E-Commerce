package com.java.mobeen;

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
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        try {
	            driver.get("https://www.spicejet.com/");
	            WebElement oneWayRadioButton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
	            oneWayRadioButton.click();
	            WebElement fromCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	            fromCity.click();
	            WebElement delhiOption = driver.findElement(By.xpath("//a[@value='DEL']"));
	            delhiOption.click();
	            WebElement toCity = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
	            toCity.click();
	            WebElement hyderabadOption = driver.findElement(By.xpath("//a[@value='HYD']"));
	            hyderabadOption.click();
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = new Date();
	            date.setTime(date.getTime() + 7 * 24 * 60 * 60 * 1000); // Adding 7 days
	            String departureDate = sdf.format(date);

	            WebElement departureDateField = driver.findElement(By.id("ctl00_mainContent_txt_DepartureDate"));
	            departureDateField.sendKeys(departureDate);
	            WebElement passengersDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	            passengersDropdown.click();
	            WebElement twoAdultsOption = driver.findElement(By.xpath("//option[@value='2']"));
	            twoAdultsOption.click();

	            WebElement childrenDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
	            childrenDropdown.click();
	            WebElement oneChildOption = driver.findElement(By.xpath("//option[@value='1']"));
	            oneChildOption.click();
	            WebElement classDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	            classDropdown.click();
	            WebElement economyClassOption = driver.findElement(By.xpath("//option[@value='Economy']"));
	            economyClassOption.click();
	            WebElement searchButton = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
	            searchButton.click();
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
	           // WebDriverWait wait = new WebDriverWait(driver,10);
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'flight-list')]")));
	            WebElement resultHeading = driver.findElement(By.xpath("//h2[contains(text(),'Results')]"));
	            if (resultHeading.isDisplayed()) {
	                System.out.println("Search results are displayed successfully.");
	            } else {
	                System.out.println("Search results are NOT displayed.");
	            }


	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}


