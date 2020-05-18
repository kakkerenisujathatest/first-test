package com.paramerter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



import org.openqa.selenium.*;
public class Parameter_test {
	//public String URL = "https://portal.newdaycards.com/debenhams/login";
	public String driverpath = "C:\\\\Users\\\\P10413552\\\\Downloads\\\\chromedriver_win32 (8)\\\\chromedriver.exe";
	public WebDriver driver;
	
	
	
	@DataProvider
	public void getTestData() {
		
		
	}
	@Test 
	@Parameters({"URL","email","password"})
	public void Login(String email, String password, String URL) {
		
		System.out.println("Om Sri Sai");
		System.setProperty("webdriver.chrome.driver", driverpath);
		 driver = new ChromeDriver();
		 driver.get(URL);
		 driver.manage().window().maximize();
		System.out.println("Om Jai Sri Sai");
		driver.findElement(By.name("j_username")).sendKeys(email);
		driver.findElement(By.name("j_password")).sendKeys(password);
		driver.findElement(By.id("loginStep1")).click();
	}

}
