/*experiment:4
 * AIM: Program on Packages
* 
* NAME: BHAKTI DEEPAK BAILURKAR
* ROLLNO: 1
* DIV: A
*/

package practical4;
/*
 * packages imported
 */
import operations.Operations;
import java.lang.Math;

public class Calculator extends Operations{
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		double add,sub,multi,div;
		 add = c.add(1,2);
		 sub = c.sub(20, 10);
		 multi = c.prod(5, 10.45);
		 div = c.div(50, 5.5);
		double sr = 49;
		double a=2,b=5;
		
		System.out.println("Addition: "+add);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+multi);
		System.out.println("Division: "+div);
		System.out.println("Sqaure-root: "+Math.sqrt(sr));
		System.out.println("Power: "+Math.pow(a, b));
		System.out.println("Maximum No.: "+Math.max(a, b));
		System.out.println("Minimum No.: "+Math.min(a, b));
		System.out.println("Bhakti Bailurkar");
		
		
	}
}
