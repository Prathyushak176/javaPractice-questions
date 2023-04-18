package Practice.day2;
class caluclator{
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
}

public class Methiodoverloading {
	public static void main(String[] args) {
		int data = 10;
		caluclator calc = new caluclator();
		int r1 = calc.add(5,7,9);
		System.out.println(r1);
		
	}

}
