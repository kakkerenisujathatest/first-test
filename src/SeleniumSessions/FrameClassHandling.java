package SeleniumSessions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameClassHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/home");
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		String	text = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		action.

		if (text.equals("Cogmento CRM")) {
		driver.findElement(By.name("email")).sendKeys("kakkereniravi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Honey2003");
//		driver.findElement(By.id("//*[@id="ui"]")
//		driver.findElement(By.className("ui fluid large blue submit button")).click();;
		
//		driver.findElement(By.xpath("//input[@id=\"ui fluid large blue submit button\" or @value = 'Login']")).click();;
		//driver.findElement(By.xpath("//input[@class='field']")).click();
		//driver.switchTo().defaultContent();
	System.out.println(driver.findElement(By.cssSelector("#ui")).getAttribute("Login"));
	//	driver.findElement(By.xpath("//[contains@class,'#ui ']));// and contains(text(), 'Login')"));
//System.out.println(	driver.findElement(By.cssSelector("//[contains@class,'#ui ']")).getText());
		
	//driver.findElement(By.cssSelector("#ui")).click();;
	//	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.cssSelector("#ui"));
//	driver.findElement(By.xpath("//*[@id="#ui"]/div/div/form/div/div[3]")).click();
	driver.findElement(By.xpath(".//*[@id='ui']/div/div/form/div/div[3]")).click();
	//driver.findElement(By.xpath(".//*[@id='ui']/div/div/div[1]]")).click();
		}
		else {
			System.out.println("Page not loaded");
		}
		
		
	}

}
