package SOSFastAutomation.SOSFast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class News {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sosfast.co.za/");
	}

	@Test
	public void deshboardbtn() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='dashboard']")).click();
		Thread.sleep(4000);
	}

	@Test
	public void announcement() throws InterruptedException {
		driver.navigate().to("https://www.sosfast.co.za/dashboard/feeds");
		Thread.sleep(4000);
	}

	@Test
	public void searchblue() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='feeds-fab']")).click();
		driver.findElement(By.xpath("//mat-icon[contains(text(),'maximize')]")).click();
		driver.findElement(By.xpath("//*[@id=\"editor-div\"]/div[1]")).sendKeys("The increase in the murder rate in Cape Town is presumably driven by gang violence ");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]/span[7]/button[1]/svg")).click();
		driver.get("C:\\Users\\Bobby Carelse\\Picture\\JPEG image (.jpg)");
					
		driver.findElement(By.xpath("//*[@id=\"editor-close\"]/span/mat-icon")).click();
	
		

	}

}
