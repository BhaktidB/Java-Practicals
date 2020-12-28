package practical6;
/*Name: Bhakti Deepak Bailurkar
 * RollNo: 1
 * Div SE A
 * expt 6(B)
 * Aim: Program on 2D array, strings functions.Strings Function:
Write a program that takes your full name as input and displays the abbreviations of the first and middle names except
 the last name which is displayed as it is. 
Example:
Input
Harry James Potter
Output
H.J. Potter
 */
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name ");
		System.out.println("First Name: ");
		String fname = sc.nextLine();
		System.out.println("Middle Name: ");
		String mname = sc.nextLine();
		System.out.println("Last Name: ");
		String lname = sc.nextLine();
		System.out.println(fname+" "+mname+" "+lname);
		
		System.out.println(fname.charAt(0)+"."+mname.charAt(0)+". "+lname);
		
		System.out.println("Bhakti Bailurkar");
		
		
	}

}
