package practical7;

import java.util.Vector;

/**Name:Bhakti Bailurkar
 * RollNO: 1 SE A
 * Expt:7(B)
 * AIM: Program on StringBuffer and Vectors
Vectors:
WAP to demonstrate the menthods of Vectors
 */
public class Vector_class {

	public static void main(String[] args) {
		Vector vc = new Vector (20);
		Vector<String> vc1 = new Vector (20);
		Integer[] ar= new Integer[4];
		
		ar[0]=1;
		ar[1]=2;
		ar[2]=4;
		ar[3]=8;
		
		vc.add(10);
		vc.add(30);
		vc.add(40);
		vc.add(50);
		vc.add(20);
		vc.add("Hello");
		
		vc1.add(0, "Arigato");
		vc1.add(1, "Sayonara");
		vc1.add(2, "Ramen");
		
		System.out.println(vc);
		
		System.out.println("Size of the vector is : " +vc1.size());
		
		System.out.println(vc.capacity());
		
		System.out.println("sub List Retrieved is : " +vc.subList(0, 3));
		
		vc.trimToSize();
		System.out.println("Size of Vector object : "+ vc.capacity());
	    
		System.out.println("vector object contains elemnent 26? " +vc.contains(26));
		
		System.out.println("Verfing elements in object and object1: "+vc.containsAll(vc1));
		
		
		System.out.println(vc1.elementAt(1));
		
		System.out.println(vc1.equals(vc));
		
		System.out.println(vc1.isEmpty());
		
		System.out.println(vc1.firstElement());
	
		
		System.out.println(vc1.indexOf(vc));
		
		vc1.insertElementAt("Gomen", 2);
		
		
		System.out.println(vc1.lastElement());
		
		System.out.println(vc1.size());
		
		System.out.println(vc1);
		
		System.out.println("value at  index 2: " +vc1.get(2));
	    
		System.out.println("Hash code of Vector is : " +vc.hashCode());
		 
		System.out.println("Values in Vector object are :" +vc);

		vc.insertElementAt("Kitty", 1);

		  System.out.println("Values in Vector object are :" +vc);
		  
		  System.out.println("Last occurance of element 3 is  : "+vc.lastIndexOf(20));
		  
		  System.out.println("removed element at index 2  : " +vc.remove(0));
		  
		  vc.removeAllElements();
		  System.out.println("Values in vector :" +vc);
		  
		  vc1.removeElementAt(1);
		  System.out.println("Values in vector :" +vc1);
		  
		  vc1.setElementAt("Japan",0);
		  System.out.println("Values in vector :" +vc1);

		  
		  vc1.set(1, "Progate");
		  System.out.println("Values in vector :" +vc1);


		  vc.setSize(10);
		  System.out.println("Values in vector :" +vc);

		  vc.clear();
		  
		  System.out.println("Bhakti Bailurkar");
}}
