package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Drag {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sosfast.co.za/");
	
}
	@Test
	public void deshboardbtn() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='dashboard']")).click();
		Thread.sleep(4000);
	}
	
	@Test
	public void Alerts() throws InterruptedException {
		driver.get("https://www.sosfast.co.za/dashboard/emergencies");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	driver.switchTo().frame(0);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"emergencies\"]/mat-list-item[1]"));
		Actions move =  new Actions(driver);
		WebElement To = driver.findElement(By.id("inProgress"));
		move  = move.dragAndDrop(from, To);
		move.build().perform();
	}
	
	@AfterTest
	public void destroy() {
		driver.quit();
	}
}