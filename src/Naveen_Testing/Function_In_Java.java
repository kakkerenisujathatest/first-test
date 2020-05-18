package Naveen_Testing;

public class Function_In_Java {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_In_Java  obj = new Function_In_Java();
		
		int nn=obj.retu();
		System.out.println(nn);
		
		int div1= obj.Div(100, 10);
		System.out.println(div1);
		
		
	}
	
public void test_name() {System.out.println("First Method");}		

public int retu() {
	int a= 10;
	int b = 20;
	int c= a+b;
	return c;		
}
		
public int Div(int x, int y) {
	
	int d = x/y;
	return d;
	
	
}


	}
	

