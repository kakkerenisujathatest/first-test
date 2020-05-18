package com.Test.Utility;

import java.util.ArrayList;
import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel1() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
try {
	reader = new Xls_Reader("C:\\Ravi DCC\\Automation\\Naveen_Testing\\src\\com\\TestData\\LoginTestData.xlsx");
	
}	catch (Exception e) {e.printStackTrace();}	
	
for(int rowCnt = 2; rowCnt<= reader.getRowCount("RegTestData");rowCnt++){
	System.out.println(reader.getRowCount("RegTestData"));
	
	String USerID = reader.getCellData("RegTestData", "Username", rowCnt);
	String Pass = reader.getCellData("RegTestData", "Password", rowCnt);
	
	Object ob[]= {USerID,Pass};
		myData.add(ob);
		//System.out.println(ob(0));
		
	
}
return myData;


		
	}

}
