package practical11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*Expt NO.:11 
 * Name:Bhakti Deepak Bailurkar
 * DIV: SE A
 * RollNO.: 1
 * Aim:AIM: Program on Exception handling and user defined exception 
Ask the user to enter marks for any 3 subjects. The subjects must be out of 50 each.
 Calculate the percentage attained by the students. 
Store the marks entered by the students in an array.
Demonstrate the following exception:
ArithmeticException
ArrayIndexOutOfBoundsException
IOException
For User defined exception if the user enters marks < 0 or > 50 then demonstrate
 user-defined exception displaying “Invalid marks”.
 * 
 */
public class Student {
	
	public static void main(String[] args) throws IOException {
		double totalmarks;
		double percentage;
		double totalvalues=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		double marks[] = new double[3];
		for(int i=0;i<marks.length;i++) {
			/*
			 * throws IOException
			 */
			System.out.println("Enter marks:");
			marks[i]=Double.parseDouble(br.readLine());
			totalvalues+=marks[i];
		}}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please Enter inside Array Bounds");
		}
		System.out.println("totalvalues: "+totalvalues);
		System.out.println("Enter total marks");
		totalmarks = Double.parseDouble(br.readLine());
		try {
			percentage = totalvalues*100/totalmarks;
			System.out.println("Percentage: "+percentage);
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
		}
	}
	
}
