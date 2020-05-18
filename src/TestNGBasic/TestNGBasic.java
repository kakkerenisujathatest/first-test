package TestNGBasic;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
	
public class TestNGBasic {
WebDriver driver;

@BeforeMethod

public void Setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://portal.newdaycards.com/debenhams/login");
	//Thread.sleep(5000);
	String title= driver.getTitle();
	System.out.println(title);
	
}
	

@AfterMethod
public void teardown() {
	
	driver.quit();
}
}
