package comm;

class Student{
	
	int rollno;
	String name;
	int marks;
	String collegename;
	
	public Student(int x) {
		this.rollno=x;
}

	public Student(int x, int y) {
		this.rollno=x;
		marks=y;
		}
	

	public Student(int x, String y, int z, Strin f) {
		this.rollno=x;
		this.name=y;
		this.marks=z;
		this.collegename=f;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", collegename=" + collegename
				+ "]";
	}
}

public class MainApplication {
	
		public static void main(String args[]) {
			Student s1=new Student(101);
			Student s2=new Student(101,250);
			Student s3=new Student(101);

		}

}
