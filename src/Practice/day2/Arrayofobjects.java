package Practice.day2;
class Student{
	int rollno;
	java.lang.String name;
	int marks;
	
}

public class Arrayofobjects {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollno=1;
		s1.name="riya";
		s1.marks=48;
		
		Student s2 = new Student();
		s2.rollno=2;
		s2.name="priya";
		s2.marks=489;
		
		Student s3 = new Student();
		s3.rollno=3;
		s3.name="supriya";
		s3.marks=47;
		Student s[] = new Student[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].name+":"+s[i].rollno);
		}
		


	}

}
