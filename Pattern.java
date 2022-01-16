import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		//Adding to Git
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a num");
		 int i,j,k, rows=sc.nextInt();
		 sc.close();
	        for ( i=1;i<=rows;i++) {
	            int num=i;
	            for ( k=0;k<=2*((rows-1)-i+1)-1;k++) {
	            	System.out.print(" ");
	        		}

	            
	            for ( j=1;j<=i;j++) {
	                System.out.print(num+" ");
	                num=num+rows-j;
	            }
	            System.out.println("");
	}

}
}
/*
 
  Give a number: 4
  
      1 
    2 5 
  3 6 8 
4 7 9 10 

*/


