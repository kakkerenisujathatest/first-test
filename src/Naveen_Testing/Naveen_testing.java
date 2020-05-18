package Naveen_Testing;

public class Naveen_testing {
	int mod;
	int wheel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Naveen_testing a = new Naveen_testing();
		Naveen_testing b = new Naveen_testing();
		Naveen_testing c = new Naveen_testing();

		
		a.mod=2003;
		a.wheel= 14;
		
		b.mod=2004;
		b.wheel= 15;
		
		c.mod=2005;
		c.wheel= 16;

System.out.println(a.mod);
System.out.println(a.wheel);

System.out.println(b.mod);
System.out.println(b.wheel);

System.out.println(c.mod);
System.out.println(c.wheel);



a=b;
b=c;
c=b;
System.out.println(a.mod);
System.out.println(a.wheel);

System.out.println(b.mod);
System.out.println(b.wheel);

System.out.println(c.mod);
System.out.println(c.wheel);



	}

}
