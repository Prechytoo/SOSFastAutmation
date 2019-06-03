package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ManageProfile {
	
	 WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.sosfast.co.za/");
	}
  //@Test
  //public void f() {
	  
		@Test (priority=1)
		public void verifySignIn(){
			driver.findElement(By.id("signIn")).click();
			System.out.println("SingIn");
			
		}
		
		@Test (priority=2)
		public void verifyLogin() throws InterruptedException{
			driver.findElement(By.id("sigin-email")).sendKeys("cindy.cp@gmail.com");
			Thread.sleep(2000);
			System.out.println("email");
			driver.findElement(By.id("sigin-password")).sendKeys("cindycp414421");
			System.out.println("password");
			Thread.sleep(1000);
		}
			@Test (priority=3)
		public void verifySignButton(){
			driver.findElement(By.xpath("//button[@id='sigin-submit']")).click();
			System.out.println("submit");
			}
			
			@Test  ( priority=4)
			public void VerifyFilter () throws InterruptedException {
				driver.findElement(By.id("dashboard")).click();
				driver.findElement(By.id("dashboard-profiles")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("The"); //by first name
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Mab");   //by last name
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
			}
			
				
			@AfterClass
			public void tearDown() {
				driver.quit();
			
			}
}
