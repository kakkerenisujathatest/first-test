package Naveen_Testing;

import Java2_Part.BMW_CLS;

public class TEST_CLS_CAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//This is static or compile time inheritance		
BMW_CLS b =new BMW_CLS();
b.start();//This is method over riding as parent has same method with all same
b.Stop();
b.refuel();
b.Safety();


new BMW_CLS();
CAR_CLS c = new BMW_CLS(); //this is dynamic polymorphsim 
c.start();
c.Stop();
c.refuel();

	}
	

}
