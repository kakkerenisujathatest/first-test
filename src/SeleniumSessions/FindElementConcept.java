package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();;
		
	//List <WebElement> linklist=	driver.findElement(By.tagName('a'));
	//List <WebElement> linklist = driver.findElements(By.tagName('a'));
	List <WebElement> linkList = driver.findElements(By.tagName("a"));
	System.out.println(linkList.size());

	for(int i =0; i<=283; i++) {
	String Link=	linkList.get(i).getText();
		System.out.println(Link);
		
	}
	
	
	}

}
