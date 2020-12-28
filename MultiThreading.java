package practical12;
/*ExptNO: 12
 * Name:Bhakti Bailurkar
 * Div: SE A
 * rollNo: 1
 * Aim:AIM: Program on Multithreading 
 *WAP to print * and / using multithreading (use minimum 5 thread methods)
 */

class ThreadingCheck extends Thread {
public void run(){
	/*
	 * current state method
	 */

	System.out.println("*  "+Thread.currentThread().getName());
	System.out.println();

	Thread.State s = Thread.currentThread().getState();
	System.out.println(s);
	
	}
}

class ThreadingCheck1 extends Thread {
public void run(){
	/*
	 * sleep method 
	 */
	try {
		Thread.sleep(2000);
	System.out.println("Thread control "+Thread.currentThread().getName());
	
	}catch(Exception e) {
		System.out.println(e+" "+Thread.currentThread().getName());
	}
	System.out.println("/  "+Thread.currentThread().getName());
	System.out.println();
	
	}
}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException{
		ThreadingCheck t = new ThreadingCheck();
		ThreadingCheck1 t1 = new ThreadingCheck1();
		t.setName("Thread *");		//set the name of thread
		t1.setName("Thread /");
		System.out.println("ID of "+t.getName()+" "+t.getId());  //get the ID method
		
		System.out.println("Max priority: "+t1.MAX_PRIORITY); //priority method set to MAX
		
		System.out.println("Before start t : "+t.isAlive());
		System.out.println();
		System.out.println("Before status of s "+t1.isInterrupted());
		System.out.println();
		
		t.start();		//starts the t thread
		t1.start();		//starts the t1 thread
		
		t1.interrupt(); 	//interrutps seep method
		/*
		 * checks the interrupt method
		 * returns in boolean
		 */
		System.out.println("After status of s "+t1.isInterrupted());
		System.out.println();
		/*
		 * checks whether thread is alive
		 */
		System.out.println("After start t1: "+t.isAlive());
		System.out.println();
		/*
		 * set priority
		 * gets the priority
		 */
		t1.setPriority(2);
		System.out.println("Priority of "+t1.getName()+" "+t1.getPriority());
		
		} }
