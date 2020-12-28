package practical8;
/**Name:Bhakti Bailurkar
 * RollNO: 1 SE A
 * Expt:8
 * AIM:Program on Hierarchical Inheritance
 * WAP to implement Hierarchical Inheritance
 */
class A{
	public void message() {
		System.out.println("class A parent");
	}
}
class B extends A{
	public void sandesh() {
		System.out.println("class B extends A");
	}
}
class C extends B{
	public void message_of_c() {
		System.out.println("class C extends B");
	}
}
class D extends B{
	public void message_of_d() {
		System.out.println("class D extends B");
	}
}
public class Hierarchy {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		c.message();	//method of parent class
		d.message();	//method of parent class
		c.sandesh();	//method of B class
		d.sandesh();	//method of B class
		c.message_of_c();	//method of C class
		d.message_of_d();	//method of D class
			
		System.out.println("Bhakti Bailurkar");

	}

}
