package practical7;
/*Name:Bhakti Bailurkar
 * RollNO: 1 SE A
 * Expt:7(A)
 * AIM: Program on StringBuffer and Vectors
 *StringBuffer:
 *WAP to demonstrate the methods of StringBuffer.
 */

public class Example {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		StringBuffer x = new StringBuffer(100);
		StringBuffer b = new StringBuffer("StringBuffer");
		
		System.out.println(s.capacity());  //initial capacity of s
		
		System.out.println(s.indexOf("i"));
		
		System.out.println(b.charAt(10));
		
		System.out.println(b.equals(x));
		
		
		System.out.println(b.lastIndexOf("S"));
		
		System.out.println("Capacity of x: "+x.capacity());	//capacity of x
		
		System.out.println("Length of b: "+b.length());	
		
		System.out.println("String: "+b.toString());
		
		b.append(" in Java");
		System.out.println(b);
		x.append(26);
		System.out.println(x);
		
		x.insert(0,20);
		System.out.println(x);
		s.insert(0,"Good Morning ");
		System.out.println(s);
		
		System.out.println(b.reverse());
		
		b.replace(0, b.length(), "PythonAndRocks");
		System.out.println(b);
		
		b.delete(6, 9);
		System.out.println(b);
		
		s.append("Hello my name is bhakti");
		s.ensureCapacity(50); 
		System.out.println(s.capacity());
		
		System.out.println(b.substring(5));
		
		x.trimToSize();
		System.out.println(x);
		
		s.setLength(50);
		
		System.out.println("Hash code is : " +s.hashCode());
		
		x.setCharAt(0,(char)0);
	
		System.out.println(x.offsetByCodePoints(0,3));
		
		
		System.out.println("Bhakti Bailurkar");
	}

}
