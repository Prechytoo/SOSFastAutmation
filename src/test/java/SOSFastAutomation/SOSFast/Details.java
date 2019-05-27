package SOSFastAutomation.SOSFast;

<<<<<<< HEAD
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
=======
import java.util.concurrent.TimeUnit;

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
	@Test 
	public void verifyPageTitleTest() {
		String title  = driver.getTitle();
		System.out.println("the page title is: "+ title);
		//Assert.assertEquals(title,"" );
	}
	
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
	public void verifySignButton(){
	driver.findElement(By.xpath("//*[@id='sigin-submit']")).click();
	}
	@Test
	public void verifyIcon(){
		boolean icon  =  driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).isDisplayed();
		Assert.assertTrue(icon);
		
	}
		@Test 
		public void clickIcon(){
			driver.findElement(By.xpath("//*[@id='app-user-image-icon']")).click();
		}
	
	{
}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}	
	


>>>>>>> a59a906ba812ae45eca9a88613be700d875ea4f3
