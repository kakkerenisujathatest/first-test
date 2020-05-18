import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	public String URL = "https://portal.newdaycards.com/debenhams/login";
	public String driverpath = "C:\\\\Users\\\\P10413552\\\\Downloads\\\\chromedriver_win32 (8)\\\\chromedriver.exe";
	public WebDriver driver;

	@BeforeMethod
	public void SetUp() throws InterruptedException {

		System.out.println("Om Sri Sai");
		// driver.manage().timeouts().wait(5000);
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();

		driver.get(URL);
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().wait(5000);

//		 driver.findElement(By.xpath("//*[@id=\'j_username\']")).sendKeys("Kakkereni");
//			driver.findElement(By.xpath("//*[@id=\'j_password\']")).sendKeys("honey");
//			driver.findElement(By.id("loginStep1")).click();
//		
	}

	@Test(priority = 2, groups = "Login")
	public void Launch() {

		// driver.manage().window().maximize();
		System.out.println("Om Jai Sri Sai");
		driver.findElement(By.name("j_username")).sendKeys("KakkereniNex");
		driver.findElement(By.name("j_password")).sendKeys("HONEY");
		driver.findElement(By.id("loginStep1")).click();

		// driver.manage().timeouts().wait(5000);
		// driver.manage().timeouts().pageLoadTimeout(30L, 5000);
		// driver.manage().timeouts().setScriptTimeout(3L, TimeUnit.SECONDS);
//	WebElement username = driver.findElement(By.id("j_username"));
//	username.sendKeys("Kakkereni");
//	WebElement password = driver.findElement(By.id("j_password"));
//	password.sendKeys("honey");
//	WebElement loginstep = driver.findElement(By.id("loginStep1"));
//	loginstep.click();
//	WebDriver driver = new ChromeDriver();
//	driver.findElement(By.xpath("//*[@id=\'j_username\']")).sendKeys("Kakkereni");
//	driver.findElement(By.xpath("//*[@id=\'j_password\']")).sendKeys("honey");
//	driver.findElement(By.id("loginStep1")).click();
//	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	 driver.manage().window().maximize();
//	 driver.get("https://portal.newdaycards.com/debenhams/login");

		// Thread.sleep(3000);
//	driver.findElement(By.name("j_username")).clear();
//	WebElement username1 = driver.findElement(By.name("j_username"));
//	
//	username1.clear();

	}

	@Test(priority = 1, groups = "Login")
	public void Launch1() {

		// driver.manage().window().maximize();
		System.out.println("Om Jai Sri Sai");
		driver.findElement(By.name("j_username")).sendKeys("KakkereniNex1");
		driver.findElement(By.name("j_password")).sendKeys("HONEY1");
		driver.findElement(By.id("loginStep1")).click();

	}
//@Test

//public void Launch2() throws InterruptedException   {
//
//	//driver.manage().window().maximize();
//	System.out.println("Om Jai Sri Sai JAi JAi Sai");
//	driver.findElement(By.name("j_username")).sendKeys("KakkereniNex");
//	driver.findElement(By.name("j_password")).sendKeys("HONEY");
//	driver.findElement(By.id("loginStep1")).click();
//	
//	//Thread.sleep(3000);
//	driver.findElement(By.name("j_username")).clear();
//}
	@AfterMethod
	public void teardown() {
		// Thread.sleep(5000);
		// driver.quit();
		driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		System.out.println("Om Jai Sri Sai");

		driver.close();
	}

}
