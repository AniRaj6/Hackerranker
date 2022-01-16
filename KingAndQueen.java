package TestProblems;

import java.util.*;

/*
Once there lived a king and a queen. They were very rich and led a happy life.
The King's brother Humayun was jealous of him and he wanted to become the King. So in order to become the King, Humayun carries the Queen away and keeps her in a jail which are numbered in sorted sequence.
Humayun informs the King that he took away the Queen and if the King agrees him to become the King, he would leave the Queen. The King has a special power of flying. 
He flies and reaches the place where Humayun has hidden the Queen and Humayun has given clue to King about the jail number of the Queen. 
Luckily the King finds the key of the jail where the Queen is locked. But Humayun might have tried to fool the King by saying wrong jail number of Queen.
 The King already knew how many jails were there. He reaches the centre jail and checks whether the jail number and the key number are equal. 
He also carries a small machine with him to find the next jail to be visited by him. The machine initially contains 
the low(low=1) and the high value (high=total number of jails), and calculates the mid value (the jail which is to be visited). 
If the mid value and key value are equal, the King opens the lock and takes the Queen away with him. 
If the key number is greater than the mid value, the King increases the mid value by 1 in the machine and assigns it to the low value. 
If the key number is less than the mid value, the King decreases the mid value by 1 in the machine and assigns it to the high value. 
The King does this until he finds that the key value and the mid value to be equal.

Input Format
Enter the total number of jails in Humayun's Place: 5 
Enter the jail number 1 
6 
Enter the jail number 2
 89 
Enter the jail number 3
 91 
Enter the jail number 4 
105 
Enter the jail number 5 
200
Enter the clue given by Humayun: 105

Constraints

nil

Output Format

Hurray! The King rescued the Queen

*/


public  class KingAndQueen {
	public static void main(String[] argh) {
		int high;
		int i;
		
		//Creating A arraylist to take jail numbers.
		ArrayList<Integer> jailValue = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner  sc = new Scanner(System.in);
		
		//Enter the total number of jails in Humayun's Place: 5 
		 high = sc.nextInt();
		
		 //Looping and taking the jail values.
		for (i=1;i<=high;i++) {
		  jailValue.add(sc.nextInt());
		}
		  //Enter the clue given by Humayun: 105
		int keyValue =sc.nextInt();
		
			
			for(int midValue=0;midValue<=high;midValue++) {
				
					if(jailValue.get(midValue)==keyValue) {
						System.out.println("Hurry! King save the Q");
						break;
					}
					
				
			}
}

}
/*
Output Format

Hurray! The King rescued the Queen

 */


