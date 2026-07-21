package krishna_qt_com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		String AcutalTitle= "Swag Labs";
		String ExpectedURL= driver.getCurrentUrl();
		System.out.println("AcutalURL:"+AcutalTitle);
		System.out.println("ExpectedURL:"+ExpectedURL);
		if(AcutalTitle.equals(ExpectedURL))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close(); 

	}

}
