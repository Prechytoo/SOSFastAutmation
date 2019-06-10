package SOSFastAutomation.SOSFast1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HeadlessDeatails {
 
	//WebDriver driver;
		WebDriver driver = new HtmlUnitDriver();	
		
		@BeforeTest()
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		
			
			driver.get("https://www.sosfast.co.za/");
			System.out.println("Title of the page:"+ driver.getTitle());
			System.out.println ("The current URL of the page:"+ driver.getCurrentUrl());
		
		}
			
			@Test (priority=1)
			public void verifySignIn(){
				driver.findElement(By.id("signIn")).click();
				System.out.println("SingIn");
				
		}
		
			
				@AfterClass
				public void tearDown() {
					driver.quit();
			} 
			
	
			
	

	 
  
}
