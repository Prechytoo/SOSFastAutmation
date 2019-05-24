package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin {
	
		WebDriver driver;

	    
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.sosfast.co.za/");
		}
			
			 
		
		@Test(priority=1)
		    public void signin() {
				driver.findElement(By.xpath("//div[@class='nav-link']")).click();
				
		}
		
		@Test(priority=2)
		public void VerifyLogin() throws Exception {
			driver.findElement(By.xpath("//div[@class='nav-link']")).sendKeys("anathimahlathi@gmail.com");
			driver.findElement(By.id("sigin-password")).sendKeys("Liyabona@1");
			driver.findElement(By.xpath("//span[contains(text(),'SignIn')]")).click();
			Thread.sleep(4000);
		}
		
		  
		  public void Done() {
		  driver.quit();

		}
	}
		


