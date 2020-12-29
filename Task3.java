class Task3{
   public static void main(String args[]) {
   int average = 76;
      if(average>=90){
         System.out.println("Out Standing");
      }
	else if(average>=85 && average<90){
         System.out.println("Grade is A+");
	}
	else if(average>=80 && average<85){
         System.out.println("Grade is A");
      }
      else if(average>=70 && average<80){
         System.out.println("Grade is B+");
      }
	else if(average>=60 && average<70){
         System.out.println("Grade is B");
	}
	else if(average>=50 && average<60){
         System.out.println("Grade is C");
	}
	else if(average>=45 && average<50){
         System.out.println("Pass");
	}
      else {
         System.out.println("Fail");
      }
   }
}