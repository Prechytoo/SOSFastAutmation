package SOSFastAutomation.SOSFast;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signin {

	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://www.sosfast.co.za/");
	}

	@Test(priority = 1)
	public void signin() {
		driver.findElement(By.xpath("//div[@class='nav-link']")).click();

	}

	@Test(priority = 2)
	public void VerifyLogin() throws Exception {
		driver.findElement(By.xpath("//input[@id='sigin-email']")).sendKeys("anathimahlathi@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("sigin-password")).sendKeys("Liyabona@1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'SignIn')]")).click();
		Thread.sleep(4000);
		
	}
	@Test(priority = 3)
	public void Singin() {
		driver.findElement(By.xpath("//*[@id=\"app-user-image-icon\"]/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"userinfo-signout\"]/span")).click();
		driver.findElement(By.xpath("//div[@class='nav-link']")).click();
		driver.findElement(By.xpath("//*[@id=\"my-signin2\"]/div/div")).click();
		
	
		
		}
	}
	
	

	
	

	

