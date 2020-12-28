package practical2;
/*Name: Bhakti Bailurkar
 * Rollno: 1
 * Aim: Programs on Class and Object
Write a program that would print the information (name, year of joining, salary, address)
 of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining       Salary                  Address
Robert            1994                  10,000                 64C- WallsStreat
Sam                2000                  20,000                68D- WallsStreat
John                1999                  30,000               26B- WallsStreat
 */


	class Employee{
		
		public String name, address;
		  public int year, salary;
		  public Employee(String n, int y, int s, String add){
		    name = n;
		    year = y;
		    salary = s;
		    address = add;
		  }
		  
	  public static void main(String[] args){
	    Employee e1 = new Employee("Robert", 1994, 10000, "64C- WallsStreet");
	    Employee e2 = new Employee("Sam", 2000, 20000, "68d- WallsStreet");
	    Employee e3 = new Employee("John", 1999, 30000, "26B- WallsStreet");
	    System.out.println("Name\tYear of joining\tSalary\tAddress");
	    System.out.println(e1.name+"\t"+e1.year+"\t\t"+e1.salary+"\t"+e1.address);  
	    System.out.println(e2.name+"\t"+e2.year+"\t\t"+e2.salary+"\t"+e2.address); 
	    System.out.println(e3.name+"\t"+e3.year+"\t\t"+e3.salary+"\t"+e3.address);  
	    System.out.println("\n");
	    System.out.println("Bhakti Bailurkar");
	  }	

}
