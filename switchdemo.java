class switchdemo{

	public static void main(String args[]){
		
		System.out.println("This is switch demo");
	String choice="hello";

	switch(choice)
{
		case "hi": System.out.println("You selected Hi");
		break;
		case "hello": System.out.println("You selected Hello");
		break;
		case "bye": System.out.println("You selected Bye");
		break;
		default: System.out.println("Wrong selection");
}
	
	
}
}