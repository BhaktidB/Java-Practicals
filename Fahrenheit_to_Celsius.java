package java_programs;
/*
 * Name: Bhakti Deepak Bailurkar 
 * Roll: 1
 * Aim: Write a program that converts a Fahrenheit degree to Celsius.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) throws IOException{
		float temp;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("Enter temperature in Fahrenheit");
	    temp = Float.parseFloat(br.readLine());
	    
	    temp = ((temp - 32)*5)/9;

	    System.out.println("temperature converted in Celsius = " + temp);

	}}
