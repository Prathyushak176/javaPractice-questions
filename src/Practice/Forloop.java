package Practice;
 class Forloop {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			System.out.println("Day" + i );
			
			for(int j=1;j<=9;j++) {
			System.out.println( "  "+(j+8)+" - "+(j+9) );
			}
		}
////////////////////////////////////////
		///question7
		for(int k=1;k<=9;k++) {
			System.out.println(k);
		}
		/////question 8(printing even numbers in a given range using for loop)
		int a=10;
		for(int l=2;l<=a;l++) {
			if(l%2==0) {
			System.out.println(l);
			}
		}
	///
		
	}
	

}
 
 