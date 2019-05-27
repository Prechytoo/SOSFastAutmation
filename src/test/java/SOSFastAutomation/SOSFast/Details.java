package SOSFastAutomation.SOSFast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Details {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sosfast.co.za/");

		
		
}
	@Test
	public void Console() throws InterruptedException {
		driver.findElement(By.id("dashboard")).click();
		driver.findElement(By.xpath("//span[contains(text(),'My Details')]")).click();
		
	}
	@Test
	public void Mydetails() {
		driver.findElement(By.xpath("//*[@id=\"mat-input-58\"]")).sendKeys("Cindy");
		driver.findElement(By.xpath("//input[@id='mat-input-31']")).sendKeys("0620193965");
		driver.findElement(By.xpath("//input[@id='mat-input-26']")).sendKeys("cindytshabalala@gmail.com");
		driver.findElement(By.xpath("mat-input-27")).sendKeys("Sister");
		driver.findElement(By.xpath("//input[@id='mat-input-28']")).sendKeys("911");
		driver.findElement(By.xpath("//input[@id='mat-input-29']")).sendKeys("10256420");
		driver.findElement(By.xpath("//button[@class='mat-raised-button mat-primary ng-star-inserted']")).click();
		
		
	}
}