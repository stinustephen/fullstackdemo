class xyz{

	xyz(){
	System.out.println("this is xyz default constructor");
	}
	xyz(int x, int y){
	System.out.println("this is xyz parametrized constructor");
	}
	void disp1(){
	System.out.println("this is disp1 method");
	}
}
class abc extends xyz{
	void disp2(){
	System.out.println("this is abc default constructor");
	}
}
class consdemo{
	public static void main(String args[]){
	abc a1=new abc();
	a1.disp2();
	a1.disp1();
	}


}