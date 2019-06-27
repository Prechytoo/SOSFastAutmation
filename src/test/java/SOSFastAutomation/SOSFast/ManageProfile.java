package SOSFastAutomation.SOSFast;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ManageProfile {
	

	 WebDriver driver;
	private long wait;
	
	@BeforeClass
	@Parameters({"browser","wait"})
	public void setup(String browser, long wait) {
		this.wait = wait;
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("headless")) {
			ChromeOptions options = new ChromeOptions(); // telling the app to open with headless driver
			options.addArguments("headless");
			options.addArguments("window-size=1200x600"); // give it a size to open the app
			driver = new ChromeDriver(options); // the last step for headless driver this one is opening using headless
												
		}
	}


		@Test (priority=1)
		public void verifySignIn(){
			driver.navigate().to("https://www.sosfast.co.za");
			driver.findElement(By.id("signIn")).click();
			System.out.println("SignIn");
	
		}
		
		@Test (priority=2)
		public void verifyLogin() throws InterruptedException{
			driver.findElement(By.id("sigin-email")).sendKeys("cindy.cp@gmail.com");
			Thread.sleep(wait);
			System.out.println("email");
			driver.findElement(By.id("sigin-password")).sendKeys("cindycp414421");
			System.out.println("password");
			Thread.sleep(wait);
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
				Thread.sleep(wait);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("The"); //by first name
				Thread.sleep(wait);
				System.out.println("first name clicked");
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
				Thread.sleep(wait);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).clear();
				System.out.println("Textbox cleared");
				Thread.sleep(wait);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Mab");   //by last name
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-profiles[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
				System.out.println("last name clicked");
				Thread.sleep(wait);
				
			}
			
		
			@AfterClass
			public void tearDown() {
				driver.quit();
			
			}
}
