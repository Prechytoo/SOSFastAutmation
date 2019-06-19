package SOSFastAutomation.SOSFast;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class News {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sosfast.co.za/");
	}

	@Test
	public void deshboardbtn() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='dashboard']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void announcement() throws InterruptedException {
		driver.navigate().to("https://www.sosfast.co.za/dashboard/feeds");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void searchblue() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='feeds-fab']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-feeds[1]/div[1]/div[3]/div[1]/app-text-editor[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"editor-div\"]/div[1]")).sendKeys("The increase in the murder rate in Cape Town is presumably driven by gang violence ");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"editor-close\"]/span/mat-icon")).click();
		
	driver.close();

	}

}
