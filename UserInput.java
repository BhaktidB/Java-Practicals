package practical5;
/*expt5(A)
 * Name: Bhakti Bailurkar
 * RollNo: 1
 * Aim: Program on accepting input through keyboard
 */

import java.io.*;

public class UserInput  {

	public static void main(String[] args) throws Exception {
		int values; 
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);  
		System.out.println("Enter name");
		String name=br.readLine();
		System.out.println("enter three numbers");
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		
		if(n1==n2 && n2==n3) {
			System.out.println("Hey, "+name+" three numbers are equal.");
		}else if (n1==n2||n2==n3||n1==n3) {
			System.out.println("Hey,"+name+" two numbers are equal.");
		}else {
			System.out.println("Hey, "+name+" no numbers are equal.");
		}
		
	}

}
