package Question2;

import java.util.Scanner;
import Question2.NotPrimeNumberException;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n=sc.nextInt();
		  int i,m=0,flag=0;      
//		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  try {
			  if(n==0||n==1){  
				   System.out.println(n+" is not prime number"); 
				   throw new NotPrimeNumberException();
				  }else{  
				   for(i=2;i<=m;i++){      
				    if(n%i==0){      
				     System.out.println(n+" is not prime number");   
				     
				     flag=1; 
				     throw new NotPrimeNumberException();
//				     break;      
				    }      
				   }      
				   if(flag==0)  { System.out.println(n+" is prime number"); }  
				  }//end of else
			  
		} catch (NotPrimeNumberException e) {
			e.printStackTrace();
		}
		  
	}

}
