package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Details {
	
 WebDriver driver;
 
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.sosfast.co.za/");
		
	}
	
	
	@Test (priority=1)
	public void verifySignIn(){
		driver.findElement(By.id("signIn")).click();
		System.out.println("SingIn");
		
	}
	
	@Test (priority=2)
	public void verifyLogin() throws InterruptedException{
		driver.findElement(By.id("sigin-email")).sendKeys("cindy.cp@gmail.com");
		System.out.println("email");
		driver.findElement(By.id("sigin-password")).sendKeys("cindycp414421");
		System.out.println("password");
		Thread.sleep(2000);
	}
		@Test (priority=3)
	public void verifySignButton(){
		driver.findElement(By.xpath("//button[@id='sigin-submit']")).click();
		System.out.println("submit");
	}
		
	@Test (priority=4)
	public void verifyIcon() throws InterruptedException{
		if (!driver.findElement(By.xpath("//li[@id='app-user-image-icon']")).isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='app-user-image-icon']")).click();
		Thread.sleep(2000);
		Alert alert =driver.switchTo().alert();
		String print = alert.getText();
		System.out.println(driver.switchTo().alert().getText());  
		System.out.println(print);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		}


		@Test (priority=5)
		public void clickAllLinks() throws InterruptedException{
			//driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).click();
			//driver.findElement(By.id("userinfo-name")).sendKeys("0816802756");
			//driver.findElement(By.xpath("//input[@id='mat-input-16']")).sendKeys("0715515326");
			Thread.sleep(2000);
			driver.findElement(By.id("userinfo-viewall")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-mydetails")).click();
			driver.findElement(By.id("dashboard-profiles")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-station")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-emergency")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-stats")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[7]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[8]")).click();
			//driver.navigate().back();
			
		}
		
		@Test (priority=6)
		public void returnToMydeails() throws InterruptedException {
			driver.navigate().to("https://www.sosfast.co.za/dashboard/userinfo");
			driver.findElement(By.id("dashboard-mydetails")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[8]/div[1]/div[1]/div[1]/input[1]")).sendKeys("precious");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[9]/div[1]/div[1]/div[1]/input[1]")).sendKeys("0761163987");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[10]/div[1]/div[1]/div[1]/input[1]")).sendKeys("cindy.cp@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[11]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Sister");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[12]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Discovery");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[13]/div[1]/div[1]/div[1]/input[1]")).sendKeys("0763560123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[14]/div[1]/div[1]/div[1]/input[1]")).sendKeys("D9003040");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/button[1]")).click();
			
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[8]/div[1]/div[1]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[9]/div[1]/div[1]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[10]/div[1]/div[1]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[11]/div[1]/div[1]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[12]/div[1]/div[1]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[13]/div[1]/div[1]/div[1]/input[1]")).clear();
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[14]/div[1]/div[1]/div[1]/input[1]")).clear();
				
			}

		@AfterClass
		public void tearDown() {
			driver.quit();
	} 
		
		{
}



	
}	
	


