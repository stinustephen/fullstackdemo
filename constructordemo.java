class Abc{
	int a;
	int b;
	String name="Stinu";
	Abc(int x, int y){
		a=x;
		b=y;
		System.out.println("This is Paramatrized constructor");
	}
	
	public void display(){
		System.out.println("X value is: "+a+"Y value is: "+b);
	}

	
}

class constructordemo{
	public static void main(String args[]){
        Abc a1 = new Abc(20,50);
         a1.display();
	System.out.println(a1.name);
}
}