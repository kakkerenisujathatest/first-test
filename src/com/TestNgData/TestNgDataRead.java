package com.TestNgData;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Test.Utility.TestUtil;

public class TestNgDataRead {
	@FindBy(name= "j_username")
	WebElement j_username;
	
	public String driverpath = "C:\\\\Users\\\\P10413552\\\\Downloads\\\\chromedriver_win32 (8)\\\\chromedriver.exe";
	WebDriver driver;

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get("https://portal.newdaycards.com/debenhams/login");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);

													}
	
	@DataProvider
	public  Iterator<Object[]> getTestData() {
		
	ArrayList<Object[]>	testData = TestUtil.getDataFromExcel1();
	
	return testData.iterator();	
		
		
		
							}//End getTestData

	@Test(dataProvider="getTestData")
	public void logintest(String USerID, String Pass) throws InterruptedException {

		System.out.println(USerID);
		System.out.println(Pass);
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
		
		
		
		


		
		driver.findElement(By.id("j_username")).sendKeys(USerID);
//		username.sendKeys(USerID);
		driver.findElement(By.id("j_password")).sendKeys(Pass);
//		password.sendKeys(Pass);
		WebElement loginstep = driver.findElement(By.id("loginStep1"));
		loginstep.click();
		Thread.sleep(3000);
		//WebElement username1 = driver.findElement(By.name("j_username"));
		//username1.clear();
		Thread.sleep(3000);
	//	username1.sendKeys("Reentered");

																			}//End Test

	@AfterMethod
	public void teardown() {

		driver.quit();
							}//End Teadown
								}//End Class
