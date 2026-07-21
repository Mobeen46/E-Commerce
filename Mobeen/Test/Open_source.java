package Mobeen.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_source {
	WebDriver driver;
	public void lach() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		driver.manage().window().maximize();
		Thread.sleep(200);
	}
	public void source() {
		String src=driver.getPageSource();
		System.out.println(src.toString());
		if(src.equalsIgnoreCase("login_souceUrl"))
		{
			System.out.println("available");
		}
		else
		{
			System.out.println("not available");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Open_source bb=new Open_source();
		bb.lach();
		bb.source();

	}

}
