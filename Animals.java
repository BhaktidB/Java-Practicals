package java_programs;
/*
 * Name: Bhakti Deepak Bailurkar 
 * Roll: 1
 * Aim: Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now
	create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs'
	with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now
	create an object for each of the subclasses and call their respective methods.
 */
class Cats extends Animals{
	
	void dogs() {
		
	}

	
	void cats() {
		System.out.println("Cats meow");
	}
}
class Dogs extends Animals{
	
	void cats() {
		
	}

	
	void dogs() {
		System.out.println("Dogs bark");
		
	}
}
abstract class Animals {

	 abstract void cats();
	 abstract void dogs();
	public static void main(String[] args) {
		Cats c = new Cats();
		Dogs d = new Dogs();
		
		c.cats();
		d.dogs();
		System.out.println("Bhakti Bailurkar");
	}

}
