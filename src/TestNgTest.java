import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;

public class TestNgTest {
	public String driverpath = "C:\\\\Users\\\\P10413552\\\\Downloads\\\\chromedriver_win32 (8)\\\\chromedriver.exe";
	WebDriver driver;

	@BeforeMethod

	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverpath);

		driver = new ChromeDriver();

		driver.get("https://portal.newdaycards.com/debenhams/login");
		Thread.sleep(5000);
		// Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Test
	public void logintest() throws InterruptedException {

		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Login")) {
			System.out.println("Launched corrected");
		} // if end
		else {
			System.out.println("Not corrected");
		} // else end
		System.out.println(driver.getCurrentUrl());

		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("j_username"));
		username.sendKeys("Kakkereni");
		WebElement password = driver.findElement(By.id("j_password"));
		password.sendKeys("honey");
		WebElement loginstep = driver.findElement(By.id("loginStep1"));
		loginstep.click();
		Thread.sleep(3000);
		WebElement username1 = driver.findElement(By.name("j_username"));

		username1.clear();
		Thread.sleep(3000);
		username1.sendKeys("Reentered");

	}

	@AfterMethod
	public void teardown() {

//		driver.quit();
	}
}
