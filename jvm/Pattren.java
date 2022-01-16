package jvm;
public class Pattren
{
	public static void main(String[] args)
	 {
	 int i,j,k, rows =4; 
	 
	 for ( i = 1; i <= rows; i++)
	 {
		 int num=i;
		 for ( k=0;k<=2*((rows-1)-i+1)-1;k++) {
			 System.out.print(" ");
		 }
		for ( j = 1; j <= i; j++)
			 {
				 System.out.print(num+" ");
				 num = num+rows-j ;
			 }
			 
	     		System.out.println();
		 }
 }
}
