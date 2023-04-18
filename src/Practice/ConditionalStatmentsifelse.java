package Practice;

public class ConditionalStatmentsifelse {
	public static void main(String[] args) {
		int x =5;
		int y= 7;
		int z=9;
		
		
		if (x>y && x<z) {
		
			System.out.println("x is greater than y");
		}
		else if(y>x && y>z) {
			System.out.println("y is greater than x");
		}
		else {
			System.out.println("z is greatest");
		}
		/////////////////////
		int n=0;
		
		if(n%2==0)
			System.out.println("even");
		else
			
		System.out.println("odd");
		////////////////////
		//Question 5
		int a=2;
		if(a>0) {
		System.out.println("positive");
		}
		 
		else if(a<0){
			System.out.println("Negitive");
		}
		else {
			System.out.println("zero");
		}
				
		    
		
		
	}

}
