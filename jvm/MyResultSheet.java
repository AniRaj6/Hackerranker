package jvm;

import java.util.ArrayList;
import java.util.Scanner;

public class MyResultSheet {
	
   public static void main(String[] args) {
	   int i,n,sum=0;
	   ArrayList<Integer> myResult= new ArrayList<Integer>();
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter The Number of Subjects");
	     n = sc.nextInt();
	   for ( i=1;i<=n;i++) {
		   System.out.println("Enter the marks");
		    myResult.add(sc.nextInt());
	   }

	   for(int i2:myResult) {
		  sum +=i2;
	   }
	   double avg = sum/n;
	   System.out.println("Sum of the Marks are:"+sum);
	   System.out.println(avg+"%");
	
}


}







