package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Xls_Reader reader = new Xls_Reader("C:\\Ravi DCC\\Automation\\Naveen_Testing\\src\\com\\TestData\\ebayTestData.xlsx");
		String firstname= reader.getCellData("RegTestData", "FirstName", 2);
		System.out.println(firstname);
		int rowcnt = reader.getRowCount("RegTestData");
		System.out.println(rowcnt);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10413552\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://portal.newdaycards.com/debenhams/loging");

		
		
	}

}
