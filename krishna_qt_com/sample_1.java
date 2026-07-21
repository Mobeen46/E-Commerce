package krishna_qt_com;


import org.openqa.selenium.chrome.ChromeDriver;

public class sample_1 {

	public void sample() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		}
	public static void main(String []args) throws InterruptedException {
		sample_1 AA=new sample_1();
		AA.sample();
	}
	}
	





