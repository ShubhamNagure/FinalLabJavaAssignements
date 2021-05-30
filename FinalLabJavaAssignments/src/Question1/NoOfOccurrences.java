package Question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Algo:
//Open a file in read mode using file pointer.
//Read a line from file.
//Split the line into words and store it in an array.
//Iterate through the array, increment count by 1 for each word.
//Repeat all these steps till all the lines from the files has been read.

public class NoOfOccurrences {
	public static void main(String[] args) throws IOException {
		String line;  
        int count = 0;
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the file");
		String filename = sc.next();
		
		System.out.println("String to be searched");
		String toSearch =sc.next();
		
		
        //Opens a file in read mode  
		FileReader file = new FileReader(filename);
        BufferedReader br = new BufferedReader(file);  
        
      //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //iterate through the words[] and check 
            
            //check if string is present in array
			if (Arrays.asList(words).contains(toSearch)) {
				count +=1;
			}
        }
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
	}

}
