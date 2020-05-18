package SeleniumSessions;
import org.openqa.selenium.chrome.*;

import javax.xml.soap.Text;

//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

//import org.openqa.selenium.ie.*;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class SSMI_Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
		driver.getCurrentUrl();
		driver.findElement(By.name("proceed")).click();
		Alert alert =driver.switchTo().alert();
		
		System.out.println(alert.getText());
		Thread.sleep(5000);
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert");}
			
			else {
				
				System.out.println("in Correct Alert");
				
	
			
		}
		
		
		alert.accept();
		
		
		

	}

}
