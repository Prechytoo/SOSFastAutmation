package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class headbrowser {

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("headless")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");

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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void Dashboard() throws InterruptedException {
		driver.findElement(By.id("dashboard")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void Searchbox() {
		driver.findElement(By.xpath(" //input[@id='searchTextField']")).click();
		driver.findElement(By.xpath(" //input[@id='searchTextField']"))
				.sendKeys("CPT062 Brackenfell, Brackenfell South, Cape Town, South Africa");
		driver.findElement(By.xpath("//mat-icon[@class='mat-icon mat-primary material-icons']")).click();
	}

	@Test(priority = 3)
	public void ServiceStation() throws InterruptedException {
		driver.findElement(By.xpath(
				"//span[@class='mat-button-wrapper']//mat-icon[@class='mat-icon material-icons'][contains(text(),'add')]"))
				.click();
		driver.findElement(By.xpath("//input[@id='update-station-station-name']")).sendKeys("Delft station");
		driver.findElement(By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'METRO POLICE')]")).click();
		driver.findElement(By.xpath("//mat-select[@id='mat-select-1']//div[@class='mat-select-value']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'SPECIALIST')]")).click();
		driver.findElement(By.id("update-station-phone")).sendKeys("0631834980");
		driver.findElement(By.id("update-station-email")).sendKeys("anathimahlathi@gmail.com");
		driver.findElement(By.id("update-station-address")).sendKeys("5 kamassie street main road");
		driver.findElement(By.id("update-station-longitude")).sendKeys("30");
		driver.findElement(By.id("update-station-latitude")).sendKeys("20");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label/div[1]/div[2]")).getSize());
		driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-2']//div[@class='mat-radio-inner-circle']"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

	}

}
