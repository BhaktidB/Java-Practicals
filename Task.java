package java_programs;

import java.util.Scanner;

/*
 * Name: Bhakti Deepak Bailurkar 
 * Roll: 1
 * Aim: You will be given two integers x and y as input, you have to compute x/y. If x and y
	are not 32 signed integers or if is zero, exception will occur and you have to
	report/display it.
 */
public class Task {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        try{
	        	try{
	        		int x = sc.nextInt();
		            int y = sc.nextInt();
		            System.out.println(x/y);
	        	}catch (Exception e){
	        		System.out.println("Exception has occured");
	        	}
	            
	        }catch(Exception e){
	            System.out.println(e);
	        }

	        System.out.println("Bhakti Bailurkar");
	}

}
