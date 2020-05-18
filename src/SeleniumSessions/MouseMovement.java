package SeleniumSessions;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.currys.co.uk/gbuk/index.html");
		Actions action = new Actions(driver);
//		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Apple Watch");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		//Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.linkText("Kitchen Appliances"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Washing Machines"))).build().perform();
		//WebElement username1 = driver.findElement(By.linkText("Drones"));
		
		//username1.click();
				
		
		
	}

}
