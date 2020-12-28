package java_programs;
/*
 * Name: Bhakti Deepak Bailurkar 
 * Roll: 1
 * Aim: Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
	units by creating a class named 'Triangle' without any parameter in its constructor and
	execute the values using objects
 */
public class Triangle {
	int s1,s2,s3;
	public double area() {
		int a = perimeter();
		return  Math.pow((a*(a-s1)*(a-s2)*(a-s3)),.5);
		
	}
	public int perimeter() {
		return (s1+s2+s3)/2;
		
	}
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.s1=3;
		t.s2=4;
		t.s3=5;
		
		System.out.println("Area "+t.area());
		System.out.println("Perimeter "+t.perimeter());
		
	}

}
