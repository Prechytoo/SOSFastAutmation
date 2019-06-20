package SOSFastAutomation.SOSFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Details {

	WebDriver driver;
	int wait;

	@BeforeClass
	@Parameters({"browser", "wait"})
	public void setup(String browser, int wait) {
		if (browser.equalsIgnoreCase("chrome")) {
			//create chrome instance
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("headless")) {
			ChromeOptions options = new ChromeOptions(); // telling the app to open with headless driver
			options.addArguments("headless");
			options.addArguments("window-size=1200x600"); // give it a size to open the app
			driver = new ChromeDriver(options); // the last step for headless driver this one is opening using headless
		}									
	}

	@Test(priority = 1)
	public void verifySignIn() {
		driver.navigate().to("https://www.sosfast.co.za");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//label[contains(text(),'SOSFast Mobile App')]"));
		System.out.println("SOSFast Moible APP");
		driver.findElement(By.id("signIn")).click();
		System.out.println("SingIn");
	}

	@Test(priority = 2)
	public void verifyLogin() throws InterruptedException {
		// searching for email and password fields
		driver.findElement(By.id("sigin-email")).sendKeys("cindy.cp@gmail.com");
		System.out.println("email");
		driver.findElement(By.id("sigin-password")).sendKeys("cindycp414421");
		System.out.println("password");
		Thread.sleep(wait);
	}

	@Test(priority = 3)
	public void verifySignButton() {
		// locate the login button and click on it
		driver.findElement(By.xpath("//button[@id='sigin-submit']")).click();
		System.out.println("submit");
	}
	@Test(priority = 4)
	public void verifyIcon() throws InterruptedException {
		if (!driver.findElement(By.xpath("//li[@id='app-user-image-icon']")).isDisplayed())
			;
		System.out.println("Image display");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='app-user-image-icon']")).click();
		System.out.println("icon clicked");
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String print = alert.getText();
		System.out.println(driver.switchTo().alert().getText());
		System.out.println(print);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		alert.accept();
		System.out.println("popup accepted");
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void clickAllLinks() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.id("userinfo-viewall")).click();
		System.out.println("Viewall Clicked");
		Thread.sleep(1000);
		driver.findElement(By.id("dashboard-mydetails")).click();
		System.out.println("Mydetails clicked");
		Thread.sleep(1000);
		driver.findElement(By.id("dashboard-profiles")).click();
		System.out.println("Profile Clicked");
		Thread.sleep(1000);
		driver.findElement(By.id("dashboard-station")).click();
		System.out.println("Station clicked");
		Thread.sleep(1000);
		driver.findElement(By.id("dashboard-emergency")).click();
		System.out.println("Emergency clicked");
		Thread.sleep(1000);
		driver.findElement(By.id("dashboard-stats")).click();
		System.out.println("Stats clicked");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[7]")).click();
		System.out.println("Community clicked");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/a[8]")).click();
		System.out.println("Mydetails clicked");

		
		
	}

	@Test(priority = 6)
	public void returnToMydeails() throws InterruptedException {
		driver.navigate().to("https://www.sosfast.co.za/dashboard/userinfo");
		driver.findElement(By.id("dashboard-mydetails")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[8]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("precious");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[9]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("0761163987");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[10]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("cindy.cp@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[11]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Sister");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[12]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Discovery");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[13]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("0763560123");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[14]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("D9003040");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/button[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[8]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[9]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[10]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[11]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[12]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[13]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-dashboard[1]/div[2]/app-user-detailed-info[1]/div[1]/div[2]/mat-form-field[14]/div[1]/div[1]/div[1]/input[1]"))
				.clear();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	{
	}
}
