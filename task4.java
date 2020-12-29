import java.util.Scanner;
class task4{

	public static void main(String args[])
	{
        String id=""; String name=""; String designation="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for your details ");
	System.out.println("Enter 2 for display your details ");
	System.out.println("Please enter your choice");
        String a=sc.next();
switch(a)
		{
	case "1": 
		System.out.println("Enter your details");
		Scanner sa=new Scanner(System.in);
		System.out.println("1.Employee ID: ");
		System.out.println("2.Employee name: ");
		System.out.println("3.Designation: ");
		id= sc.next();
		name=sc.next();
		designation=sc.next();
		String ee=sc.next();
	
	case "2":
		System.out.println("Entered details");
		System.out.println("1.Employee ID: "+id);
		System.out.println("2.Employee name: "+name);
		System.out.println("3.Designation: "+designation);
		break;
		default: System.out.println("Invalid entry");
		}
	}
}