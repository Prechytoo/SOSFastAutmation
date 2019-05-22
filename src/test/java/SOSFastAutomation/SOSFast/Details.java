package SOSFastAutomation.SOSFast;

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
	


