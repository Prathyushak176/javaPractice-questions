package Practice;

public class Whileloop {
	public static void main(String[] args) {
		///while loop
		int i = 1;
		while(i<=4)
		{
			System.out.println("hii" + i);
			int j=1;
		while(j<2){
				System.out.println("hello sree"+j);
				j++;
			}
			
			i++;
		}
		System.out.println("bye"+i
				);
		
		
		///doWhile
		int k = 5;
		do {
			System.out.println("hello sree"+k);
			k++;
		}while(k<=4);
		
		
		
		
		/////question10(printing prime numbers using while loop)
		int p=2;
		  int n = 1;
		  int d=0;

		  while (n <= 100) {
		   
		   ;
		   while (p <= n / 2) {
		    if (n % p == 0) {
		     d++;
		     break;
		    }
		    p++;
		   }
		   if (d == 0 && n != 1) {
		    System.out.print(n + " ");
		   }
		   n++;
		  }
		
		
	}

}
