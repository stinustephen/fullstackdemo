class stringdemo{

	public static void main(String args[]){
		int a=80;
		int b=6;
		int c=5;
		int d=7;
		a=20;
	System.out.println("A value is: "+(a+10));

	String s= "Stinu";
	System.out.println(s);
	s=s.concat(" Stephen");
	System.out.println(s);

	System.out.println(s.toUpperCase());
	System.out.println("string length is: "+s.length());

	System.out.println("Using new keyword");
	String str2= new String("Anu");
	String str3= new String("Anu");
	str2.concat("Stini");
	System.out.println(str2);
	System.out.println(str2.toLowerCase());

	System.out.println(s.compareTo(str2));

	StringBuffer sb= new StringBuffer("Marlabs");  
	sb.append(" Training");
	System.out.println(sb); 
	

	StringBuilder su=new StringBuilder("Good Morning");
	su.append(" Have a nice day");
	System.out.println(su);    

	String tr= "                         How are you?";
	System.out.println(tr.trim());  

	System.out.println(String.format("a=%d \nb=%d \nc=%d \nd=%d", a,b,c,d));

	String s1="";
	String s2="Hello";
	String s5="hello";
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(s2.equalsIgnoreCase(s5));
	int value=100;
	String s3=String.valueOf(value);
	System.out.println(s1+50);

	String s4="Hey morning friends";
	String replaceString=s4.replace("friends","Guys");
	System.out.println(replaceString);
	System.out.println(s4.endsWith("friends"));
	System.out.println(s4.endsWith("Guys"));


	
	
}

}