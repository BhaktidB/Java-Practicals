package practical1;
/*
 * AIM: Programs on Basic programming constructs like branching and looping.
WAP in Java to Check Whether a Number is Palindrome or Not [Looping]
NAME: BHAKTI DEEPAK BAILURKAR
ROLLNO: 1
DIV: A
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Bhakti Bailurkar");
		int r,sum=0,temp;    
		  int n=12321;
		  temp=n;    
		   while(n>0){    
		    r=n%10;    
		    sum=(sum*10)+r;    
		    n=n/10;    
		  }    
		  if(temp==sum) {  
		   System.out.println("palindrome number ");}
		  else {
		   System.out.println("not palindrome"); }
		
		
	}
}
