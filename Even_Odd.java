package java_programs;

import java.util.Scanner;

/*
 * Name: Bhakti Deepak Bailurkar 
 * Roll: 1
 * Aim: Write a program to take input numbers in an array and find the average of all the even
	numbers and odd numbers in the array and print the same.
 */
public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num []= new double[10];
		double sum_e=0;
		double sum_o=0;
		int ce = 0,co = 0;
		
		System.out.println("Enter 10 numbers: ");
		for(int i=0; i<num.length;i++) {
			num[i]=sc.nextDouble();	
		}
		
		for(int i=0; i<num.length;i++) {
		if(num[i]%2==0) {
			sum_e =+num[i];
			ce++;
			
		}else {
			sum_o =+num[i];
			co++;
		}
	}
		double avge = sum_e/ce;
		double avgo = sum_o/co;
		
		System.out.println("Average even num: "+avge);
		System.out.println("Average odd num: "+avgo);

	}

}
