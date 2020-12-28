package practical9;
/* expt:9
 * NAME: BHAKTI DEEPAK BAILURKAR
 * ROLLNO: 1
 * DIV: A
 * AIM: Program on Multiple Inheritance
 *WAP on multiple Inheritance using the appropriate method.
 */
interface Mother{
	 void chef();
}

interface Father{
	 void manager();
}

class Parents implements Father,Mother{
	public void chef() {
		System.out.println("I am a mom and i can cook delicious meal.");
	}
	
	public void manager() {
		System.out.println("I am a dad and i can manage my work at office.");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Parents parent = new Parents();
		parent.chef();
		parent.manager();
		
	}

}
