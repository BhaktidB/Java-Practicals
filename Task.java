package practical12;
/*ExptNO: 12
 * Name:Bhakti Bailurkar
 * Div: SE A
 * rollNo: 1
 * Aim:AIM: Program on Multithreading 
 *WAP to print * and / using multithreading (use minimum 5 thread methods)
 */
import java.util.Scanner;

class Multiple extends Thread{
	int a , b;
	Multiple(int n1, int n2){
		a=n1;
		b=n2;
	}
	public void run() {
		System.out.println("THREAD A:: Multiple");
		System.out.println(" PRODUCT  "+(a*b));
	}
}
class Division extends Thread{
	int a , b;
	Division(int n1, int n2){
		a=n1;
		b=n2;
	}
	public void run() {
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("THREAD B:: Divison");
		System.out.println(" Divison  "+(a/b));
	}
}
public class Task {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
	    System.out.println("ENTER TWO VALUES:");
	    
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
		Multiple m = new Multiple(x,y);
		Division d = new Division(x,y);
		
		System.out.println("Print * and /");
		
		m.start();
		d.start();
		
		d.interrupt();
		System.out.println("After status of d "+d.isInterrupted());
		System.out.println();
		System.out.println("After start d: "+d.isAlive());
		System.out.println();
		m.setPriority(1);
		m.setName("THREAD A");
		System.out.println("Priority of "+m.getName()+" "+m.getPriority());

	}

}
