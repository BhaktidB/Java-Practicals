package practical6;
/*expt6(A)
 * NAME: Bhakti Deepak Bailurkar
 * RollNo: 1
 * Div: SE A
 * Aim: Program on 2D array, strings functions
2D Array:
Initialize a 2D array of 3*3 matrix and:
a)	Check if the matrix is symmetric or not.
b)	Check if the matrix is skew-symmetric or not.
c)	Check if the matrix is diagonal or not.
d)	Find the trace of the matrix.
 */
import java.util.Scanner;

		 
		public class Matrix
		{   
		    public static void main(String[] args)
		    {
		        Scanner sc = new Scanner(System.in);		     
		        System.out.println("Enter the no. of rows : ");		         
		        int rows = sc.nextInt();		         
		        System.out.println("Enter the no. of columns : ");		         
		        int cols = sc.nextInt();		         
		        int matrix[][] = new int[rows][cols];		         
		        System.out.println("Enter the elements :");	
		        /*
		         * input elements in matrix
		         */
		        for (int i = 0; i < rows; i++)
		        {
		            for (int j = 0; j < cols; j++)
		            {
		                matrix[i][j] = sc.nextInt();
		            }
		        }		     
		        /*
		         * printing matrix
		         */
		        System.out.println("Matrix :");		         
		        for (int i = 0; i < rows; i++)
		        {
		            for (int j = 0; j < cols; j++)
		            {
		                System.out.print(matrix[i][j]+"\t");
		            }
		             
		            System.out.println(); //formating in matrix form
		        }
		         
		        
		        if(rows != cols)
		        {
		            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
		        }
		        else
		        {
		            boolean symmetric = true;
		            boolean skewsymmetric = true;
		            /*
		             * Check if the matrix is symmetric or not.
		             */
		            for (int i = 0; i < rows; i++)
		            {
		                for (int j = 0; j < cols; j++)
		                {
		                    if(matrix[i][j] != matrix[j][i]) //taking transpose to check if equal
		                    {
		                        symmetric = false;
		                        break;
		                    }
		                }
		            }
		            if(symmetric)
		            {
		                System.out.println("The given matrix is symmetric...");
		            }
		            else
		            {
		                System.out.println("The given matrix is not symmetric...");
		            }
		            
		            /*Check if the matrix is skew-symmetric or not.
		             * 
		             */
		            for (int i = 0; i < rows; i++)
		            {
		                for (int j = 0; j < cols; j++)
		                {
		                	
		                	if (matrix[i][j] != -matrix[j][i]) 
		                    {
		                		skewsymmetric = false;
		                        break;
		                    }
		                }
		            }		  
		           
		            if(skewsymmetric)
		            {
		                System.out.println("The given matrix is skewsymmetric...");
		            }
		            else
		            {
		                System.out.println("The given matrix is not skewsymmetric...");
		            }
		            
		            /*Checking of diagonal matrix
		             * 
		             */
		            int p=0, q=0;
		            for(int i=0;i<rows;i++)
		            {
		                for(int j=0;j<cols;j++)
		                {
		                    if(i!=j && matrix[i][j]!=0) // Checking non-diagonal elements
		                    {
		                        p=1;
		                        break;
		                    }
		                    if(i==j && matrix[i][j]==0) // Checking diagonal elements
		                    {
		                        q++;
		                    }
		                }
		            }
		              
		            if(p==0 && q<rows)
		                System.out.println("The matrix is Diagonal");
		            else
		                System.out.println("The matrix is not Diagonal");
		            
		          /*Calculate trace of the matrix
		           * 
		           */
		            int trace=0;
		            for(int i=0;i<rows;i++)
		            {
		                trace=trace+matrix[i][i];
		            }
		            System.out.println("The trace of the matrix is "+trace);
		            
		        }//else loop ends
		        System.out.println("Bhakti Bailurkar");		         		        
		    }
		}
	
