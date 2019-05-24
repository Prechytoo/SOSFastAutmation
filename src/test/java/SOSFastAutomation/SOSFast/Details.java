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
		

	/*@Test 
	public void verifyPageTitleTest() {
		String title  = driver.getTitle();
		System.out.println("the page title is: "+ title);
		//Assert.assertEquals(title,"" );
	}*/
	
	@Test (priority=1)
	public void verifySignIn(){
		driver.findElement(By.id("signIn")).click();
		System.out.println("SingIn");
		
	}
	
	@Test (priority=2)
	public void verifyLogin(){
		driver.findElement(By.id("sigin-email")).sendKeys("cindy.cp@gmail.com");
		System.out.println("email");
		driver.findElement(By.id("sigin-password")).sendKeys("cindycp414421");
		System.out.println("password");
	}
		@Test (priority=3)
	public void verifySignButton(){
		driver.findElement(By.xpath("//button[@id='sigin-submit']")).click();
		System.out.println("submit");
	}
		
	@Test (priority=4)
	public void verifyIcon() throws InterruptedException{
		if (!driver.findElement(By.xpath("//li[@id='app-user-image-icon']")).isDisplayed());
		driver.findElement(By.xpath("//li[@id='app-user-image-icon']")).click();
		Alert alert =driver.switchTo().alert();
		String print = alert.getText();
		System.out.println(driver.switchTo().alert().getText());  
		System.out.println(print);
		driver.findElement(By.id("")).click();
		Thread.sleep(1000);
		alert.accept();
		}


		@Test (priority=5)
		public void clickIcon() throws InterruptedException{
			//driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).click();
			//driver.findElement(By.id("userinfo-name")).sendKeys("0816802756");
			//driver.findElement(By.xpath("//input[@id='mat-input-16']")).sendKeys("0715515326");
			driver.findElement(By.id("userinfo-viewall")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("dashboard-mydetails")).click();
			driver.findElement(By.id("dashboard-profiles")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("dashboard-station")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("dashboard-emergency")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("dashboard-stats")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[7]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[8]")).click();
			driver.navigate().back();
			
			
		}
		
		@Test (priority=6)
		public void verifyDetails(){
			driver.findElement(By.id("mat-input-49")).sendKeys("precious");
			driver.findElement(By.id("mat-input-55")).sendKeys("0761163987");
			driver.findElement(By.id("mat-input-50")).sendKeys("cindy.cp@gmail.com");
			driver.findElement(By.id("mat-input-51")).sendKeys("Sister");
			driver.findElement(By.id("mat-input-52")).sendKeys("Discovery");
			driver.findElement(By.xpath("//input[@id='mat-input-56']")).sendKeys("0763560123");
			driver.findElement(By.id("mat-input-53")).sendKeys("D9003040");
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/button[1]/span[1]")).click();
		
			
		
		}
		@AfterClass
		public void tearDown() {
			driver.quit();
	}
		
	{
}



	
}	
	


