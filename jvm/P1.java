package jvm;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k,j;
		for (i=1;i<=5;i++) {
			for (k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*(5-i+1)-1;j++) {
				if (i==1||j==1||j==2*(5-i+1)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}

}
