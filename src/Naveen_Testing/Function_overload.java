package Naveen_Testing;

public class Function_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function_overload obj = new Function_overload();
		
		obj.overload();
		obj.overload(10,2);
		
		
	}

	public void overload() {
		System.out.println("empty method");
	}
	
	public void overload(int a, int b) {
		int c=a/b;
		System.out.println(c);
		
	}
	
}
