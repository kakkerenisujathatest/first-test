package Java2_Part;

import java.util.ArrayList;

import java.util.Hashtable;

public class CLS_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSBC_Bank b = new HSBC_Bank();
		
		b.debit();
		b.OWN_Method();
		b.funds();
	
	USBank	 hs = new HSBC_Bank();
	System.out.println(USBank.min_bal);
	
	ArrayList ar =new ArrayList();
	Hashtable h = new Hashtable();
	
	ar.add(100);
	ar.add(200);
	ar.add(300);
	ar.add(400);
	ar.add(500);
	ar.add(600);
	System.out.println("This is Arraylist sieze"+ ar.size());

	h.put("a", "test");
	h.put("b", "test");
	h.put("c", "test");
	h.put(1, 100);
	h.put(2, 100);
	int i =0;
	for (i=0; i<ar.size();i++) {
		System.out.println(ar.get(i));
		
	}
	
	}

}
