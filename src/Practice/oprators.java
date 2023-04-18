package Practice;

public class oprators {
	public static void main(String[] args) {
		//Arithmetic operators
		 int a1 = 8;
		 int a2= 4;
		 int a3 = a1 + a2;
		
		 int a4 = a1 - a2;
		 int a5 = a1 * a2;
		 int a6 = a1 % a2;
		 int a7 = a1 / a2;
		 int a8 = a1++;
		 int a9 = a1--;
		 
		 System.out.println(a3);
		 System.out.println(a4);
		 System.out.println(a5);
		 System.out.println(a6);
		 System.out.println(a7);
		 System.out.println(a8);
		 System.out.println(a9);
		 //bitwise operators
		 int b3 = a1>>a2;
		 int b4 = a1<<a2;
		 System.out.println(b3);
		 System.out.println(b4);
		 //Relational operators
		 boolean b5 = a1 ==a2;
		 System.out.println(b5);
		 boolean b6 = a1 <=a2;
		 System
		 .out.println(b6);
		 boolean b7 = a1 >=a2;
		 System.out.println(b7);
		 boolean b8 = a1 !=a2;
		 System.out.println(b8);
		 //logical operators
		 boolean b9 = a1>a2 &&a3>a4;
		 System.out.println(b9);
		 boolean c1 = a1 >a2 ||a3>a4;
		 System.out.println(c1);
		 //Ternary operators
		 int a=2;  
		 int b=5;  
		 int min=(a<b)?a:b;  
		 System.out.println(min); 
		 
	}

}
