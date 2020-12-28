package practical3;
/*expt3(B)
 * Aim: Program on method and constructor overloading
 * Name:Bhakti Bailurkar
 * RollNo: 1
 * 
 */
public class Student12{
	String name="Unknown";
	
	Student12(String n){
		name=n;
	}
	Student12(){
		
	}
	
	public static void main(String []args) {
		Student12 s1 = new Student12("Bhakti");
		Student12 s2 = new Student12("Roma");
		Student12 s3 = new Student12();
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
	}}
