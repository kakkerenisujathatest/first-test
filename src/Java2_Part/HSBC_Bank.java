package Java2_Part;

public class HSBC_Bank implements USBank, UK_Bank{
	
	public void funds() {
		
		System.out.println("UK Funds another interface");
	}
	
	public void Credit() {
		
		System.out.println("Credit");
		
	}
	
public void debit() {
		
		System.out.println("debit");
		
	}


public void transferMoney() {
	
	System.out.println("transfer");
	
}


public void OWN_Method() {
	
	System.out.println("OWN Method");
	
}
}
