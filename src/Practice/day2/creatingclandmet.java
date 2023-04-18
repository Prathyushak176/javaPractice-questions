package Practice.day2;
class Music{
	public void playmusic() {
		System.out.println("music playing");
	}
	public String pen(int cost) {
		if(cost>=10) {
		return "redpen";
	}
		return null;
}
}

public class creatingclandmet {
	public static void main(String[] args) {
		Music ms = new Music();
		ms.playmusic();
		String str= ms.pen(1);
		System.out.println(str);
		
		
	}

}
