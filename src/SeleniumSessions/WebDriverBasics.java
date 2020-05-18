package SeleniumSessions;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://portal.newdaycards.com/debenhams/login");
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Login")){
		System.out.println("Launched corrected");}//if end
		else {
		System.out.println("Not corrected");
			}//else end
	System.out.println(driver.getCurrentUrl());
		//driver.quit();	
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
//	driver.findElement(By.xpath("//*[@id=\'j_username\']")).sendKeys("KAkkereni");
//	driver.findElement(By.xpath("//*[@id=\'j_password\']")).sendKeys("honey");
//	driver.findElement(By.id("loginStep1")).click();
//	driver.findElement(By.id("loginStep1")).sendKeys("KakkereniNex");
//	driver.findElement(By.id("j_password")).sendKeys("HONEY");
//	driver.findElement(By.name("j_username")).sendKeys("KakkereniNex");
//	driver.findElement(By.name("j_password")).sendKeys("HONEY");
//	driver.findElement(By.cssSelector("#j_username")).sendKeys("CSS Selector");
//	driver.findElement(By.cssSelector("#j_password")).sendKeys("CSS Selector");
//	driver.findElement(By.xpath("//*[@id='rememberMe']")).click();
//	Select select = new Select(driver.findElement(By.xpath("//*[@id='rememberMe']")));
//	select.selectByVisibleText("");
//driver.findElement(By.linkText("Sign up here")).click();
	//driver.get("https://portal.newdaycards.com/debenhams/login");
	
//	Alert alert= driver.switchTo().alert();
	
//	System.out.println(alert.getText());
//	alert.accept();
	
	
	
	
							}//main end

										}//Class End

