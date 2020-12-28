package practical10;
/*
 * exptNo: 10
 * Name:Bhakti Deepak Bailurkar
 * Div: SE A
 * RollNo.: 1
 * Aim: AIM: Program on abstract class and abstract methods.
 * WAP to demonstrate the abstract class and abstract methods for a banking application
 */
abstract class BankFeatures{
	abstract double deposit(double amount);
	abstract double withdraaw(double amount);
	abstract double getBalance();
	
}
class AxisBank extends BankFeatures{
private double balance;
public String name;
public int age;
	public AxisBank(String n,int a) {
		name=n;
		age=a;
		System.out.println("Name: "+n);
		System.out.println("Age: "+a);
	}
	public double deposit(double amount) {
		balance = balance + amount;
		System.out.println("Balance in your account");
		return balance;
	}

	
	public double withdraaw(double amount) {
		if(amount<=balance) {
			balance = balance-amount;
			
		}else {
			System.out.println("Insufficien amount!");
		}
		return balance;
	}

	
	public double getBalance() {
		return balance;
		
	}
	
		
}
public class TransactionManager {

	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank("Bhakti Deepak Bailurkar",19);
		System.out.println();
		ab.deposit(50000);
	    System.out.println(ab.getBalance());
		
		System.out.println("Remaining amount in account: "+ab.withdraaw(20000));
		ab.deposit(2000);
		System.out.println(ab.getBalance());
		

	}

}
