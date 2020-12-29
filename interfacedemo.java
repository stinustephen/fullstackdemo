//abstract class

interface RBI{
	int a=8;
	void loan();
	public default void display(){
	}
	static void print(){
		System.out.println("This is print method");
}
}
interface RBI2{
	void loanRecover();
}

class SBI implements RBI, RBI2{
	public void loan(){
		System.out.println("SBI class");
	}
 	public void loanRecover(){
		System.out.println("SBI class loan recover");
	}
}

class interfacedemo{
	public static void main(String args[]){
		System.out.println("This is interface demo");

		RBI s=new SBI();
		s.loan();
	}
}