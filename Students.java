package practical11;

/*Expt NO.:11 
 * Name:Bhakti Deepak Bailurkar
 * DIV: SE A
 * RollNO.: 1
 * Aim:AIM: Program on Exception handling and user defined exception 
 */
import java.util.Scanner;
import java.io.IOException;

public class Students {

	public static void main(String[] args) throws IOException{


		 try{
		 	Scanner s = new Scanner(System.in);
		 	int []m = new int[3];
			int sum = 0 ;
			System.out.println("Enter Student Marks : ");
			try{
				for(int i = 0; i < m.length; i++){
					m[i] = s.nextInt();
					for(int j = 0 ; j < m.length; j++){
						if(!(m[i]>0)||(m[i]>50)){
							/*
							 * throws user defined exception
							 */
							throw (new marks("Invalid Marks : "+m[i]));
			}
		}
	}
	for(int k=0;k< m.length; k++){
		sum = sum + m[k];
	}
	System.out.println("Enter Total Marks : ");
	int totalMarks = s.nextInt();
	int percent = (sum*100) / totalMarks;
	System.out.println("Percentage of Student: "+percent);
	
	}catch(ArrayIndexOutOfBoundsException abe){
		System.out.println("Array is out of bounds : "+abe); //checks whether array values within index
		
	}catch(ArithmeticException ae1){
		System.out.println("Please Enter proper total marks : "+ae1);  //if user inputs 0
	}	
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
/*
 * user defined exception 
 * to input valid marks
 * extends exception class
 */
class marks extends Exception{
	marks(String errorMessage){
		super(errorMessage);
	}
}