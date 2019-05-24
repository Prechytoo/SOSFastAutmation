package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stations {
	WebDriver driver;
	

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.sosfast.co.za/");
		
	}
		@Test(priority=1)
	    public void Dashboard() throws InterruptedException {
			driver.findElement(By.id("dashboard")).click();
			Thread.sleep(2000);
		}
			@Test(priority=2)
			public void Searchbox (){
			driver.findElement(By.xpath("//a[@id='dashboard-station']")).sendKeys("CPT");
			
			}			
				@Test(priority=3)
				public void ServiceStation() {
				driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//mat-icon[@class='mat-icon material-icons'][contains(text(),'add')]")).click();	
				driver.findElement(By.xpath("//input[@id='update-station-station-name']")).sendKeys("Anathi");
				driver.findElement(By.id("mat-option-23")).click();
				driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),'SATELLITE STATION')]")).click();
				driver.findElement(By.id("//input[@id='update-station-phone']")).sendKeys("0765256501");
				driver.findElement(By.id("update-station-email")).sendKeys("anathi@gmail.com");
				driver.findElement(By.id("update-station-address")).sendKeys("5 kamasie delft");
				driver.findElement(By.xpath("//input[@id='update-station-longitude']")).sendKeys("30");
				driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
				}					
	
				
}

		
