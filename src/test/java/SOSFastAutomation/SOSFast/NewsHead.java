package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewsHead {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		
		if (browser.equalsIgnoreCase("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1200x600");
			driver = new ChromeDriver(options);

		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			
			// create chrome instance
			driver = new ChromeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameter() throws InterruptedException {
		driver.get("https://www.sosfast.co.za");
	}
	
	
		@Test
		public void deshboardbtn() throws InterruptedException {
			driver.findElement(By.xpath("//a[@id='dashboard']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		@Test
		public void announcement() throws InterruptedException {
			driver.navigate().to("https://www.sosfast.co.za/dashboard/feeds");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		@Test
		public void searchblue() throws InterruptedException {
			driver.findElement(By.xpath("//button[@id='feeds-fab']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-feeds[1]/div[1]/div[3]/div[1]/app-text-editor[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"editor-div\"]/div[1]")).sendKeys("The increase in the murder rate in Cape Town is presumably driven by gang violence ");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"editor-close\"]/span/mat-icon")).click();
			
		
		
	}
}
