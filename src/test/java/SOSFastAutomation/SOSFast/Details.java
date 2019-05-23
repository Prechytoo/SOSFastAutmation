package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Details {
	
 WebDriver driver;
 
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "\"C:\\\\Program Files\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.sosfast.co.za/");
	
		
}
	/*@Test 
	public void verifyPageTitleTest() {
		String title  = driver.getTitle();
		System.out.println("the page title is: "+ title);
		//Assert.assertEquals(title,"" );
	}*/
	
	@Test ()
	public void verifySignIn(){
		driver.findElement(By.id("my-signin")).click();
	}
	
	@Test
	public void verifyLogin(String username, String password){
		driver.findElement(By.id("sigin-email")).sendKeys("cindy.cp@gmail.com");
		driver.findElement(By.id("sigin-password")).sendKeys("cindycp414421");
	}
	@Test
	public void verifySignButton() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='sigin-submit']")).click();
		
	
	}
	@Test
	public void verifyIcon() throws InterruptedException{
		boolean icon  =  driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).isDisplayed();
		Assert.assertTrue(icon);
		
		driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).click();
		Alert alert =driver.switchTo().alert();
		String print = alert.getText();
		System.out.println(driver.switchTo().alert().getText());
		System.out.println(print);
		driver.findElement(By.id("")).click();
		Thread.sleep(1000);
		alert.accept();
		
	}
		@Test 
		public void clickIcon() throws InterruptedException{
			//driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).click();
			driver.findElement(By.id("userinfo-name")).sendKeys("0816802756");
			driver.findElement(By.xpath("//*[@id='mat-input-67']")).sendKeys("0715515326");
			driver.findElement(By.id("userinfo-viewall")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-profiles")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-station")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dashboard-emergency")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='dashboard-stats']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[7]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[8]")).click();
			driver.navigate().back();
			
			
		}
		
		@Test
		public void verifyDetails(){
			driver.findElement(By.id("mat-input-138")).sendKeys("precious");
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[9]/div[1]/div[1]/div[1]")).sendKeys("0761163987");
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[10]/div[1]/div[1]/div[1]")).sendKeys("cindy.cp@gmail.com");
			driver.findElement(By.id("mat-input-140")).sendKeys("0615984632");
			driver.findElement(By.id("mat-input-141")).sendKeys("Discovery");
			driver.findElement(By.xpath("//*[@id='mat-input-145']")).sendKeys("0763560123");
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[14]/div[1]/div[1]/div[1]")).sendKeys("D9003040");
			driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/button[1]/span[1]")).click();
		
			
		
		}
	
	{
}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}	
	


