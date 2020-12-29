class nestedloop
{
	public static void main(String args[]){
	System.out.println("----This is looping demo----");
	
	System.out.println("----For loop----");
	for(int i=0;i<10;i++){
		for (int j=0;j<5;j++)
		{
		System.out.println("I value is; "+i+ " J value is: "+j);
		}
	

	System.out.println("---While loop---");
	int k=1;
	while(k<5){
	System.out.println("K value is: "+k);
	k++;
	}
	

	System.out.println("---Do While loop---");
	int x=1;
	do{
	System.out.println("Welcome to VRL"+x);
	x++;	
	}while(x<5);
	

		}
}
}
