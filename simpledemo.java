class A{

	final int a=10;
	public final void display(){
	a=50;
	System.out.println("Changed value: "+a);
}
}

class simpledemo extends A{

	public static void main(String args[]){

		System.out.println("Hi");
	A a1= new A();
	System.out.println(a1.a);
	a1.display();

	}
}