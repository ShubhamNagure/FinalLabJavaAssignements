package Question4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import Question4.InvalidAgeException;

public class AddSeniorCitizenDetails {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter name\n"); 
			String name=sc.next();
			
			System.out.println("Please enter age here \n");
			int age=sc.nextInt();
			
			
			 try {
			      FileWriter myWriter = new FileWriter("SeniorDetails.txt");
			      try {
			    	  if(age<60) {
			    		  throw new InvalidAgeException();
			    	  }else {
					      myWriter.write("Name :" + name + " " + "age: "+ age);
					      myWriter.close(); 
					      System.out.println("Successfully wrote to the file.");
			    	  }
			      }catch (InvalidAgeException e) {
			    	  e.printStackTrace();
				}
			      
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
	}
}
