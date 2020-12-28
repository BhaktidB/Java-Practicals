package practical2;
/*NAME: Bhakti Bailurkar
 * RollNo: 1
 * Aim: Programs on Class and Object
Create a class named 'Student' with variables name, roll_no, contact_no.
Create 3 objects of the class Student and assign and print the values of the variables name, roll_no,
  contact_no for each individual student.
 */
public class Student {
	String name;
	int rollno,contactno;
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name="Bhakti Bailurkar";
		s1.rollno=1;
		s1.contactno=123456789;
		
		s2.name="Radhika Bailurkar";
		s2.rollno=2;
		s2.contactno=234567891;
		
		s3.name="Roma Shirodkar";
		s3.rollno=3;
		s3.contactno=345678912;
		System.out.println("name: "+s1.name+" rollno: "+s1.rollno+" contactno: "+s1.contactno );
		System.out.println("name: "+s2.name+" rollno: "+s2.rollno+" contactno: "+s2.contactno );
		System.out.println("name: "+s3.name+" rollno: "+s3.rollno+" contactno: "+s3.contactno );
		
		System.out.println("Bhakti Bailurkar");
		
	}

}
