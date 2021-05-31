import java.util.Scanner;

import mcai.MCAIMarks;
import mcaii.MCAIIMarks;

public class Program11 {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of students : ");
		int studCnt = s.nextInt();
		
		MCAIMarks mcaI[]   = new MCAIMarks[studCnt];
		MCAIIMarks mcaII[] = new MCAIIMarks[studCnt];
		
		float m1, m2, m3, m4;
		for(int i=0; i<studCnt; i++) {
			System.out.println("Enter Student " + (i+1) + " MCAI SemI Marks = ");
			m1 = s.nextFloat();
			System.out.println("Enter Student " + (i+1) + " MCAI SemII Marks = ");
			m2 = s.nextFloat();
			System.out.println("Enter Student " + (i+1) + " MCAII SemI Marks = ");
			m3 = s.nextFloat();
			System.out.println("Enter Student " + (i+1) + " MCAII SemII Marks = ");
			m4 = s.nextFloat();
			
			mcaI[i]  = new MCAIMarks(m1, m2);
			mcaII[i] = new MCAIIMarks(m3, m4);
		}
		
		float marks = 0;
		for(int i=0; i<studCnt; i++){
			
			marks = mcaI[i].SemITotal + mcaI[i].SemIITotal + mcaII[i].SemITotal + mcaII[i].SemIITotal;
			
			System.out.println("Student " + (i+1) + " Result : ");
			
			float result = marks / 4f; 
			System.out.println("Total Percentage : " + result);
			
			if(result >= 70 )
				System.out.println("Grade A");
			else if(result >= 60 )
				System.out.println("Grade B");
			else if(result >= 50 )
				System.out.println("Grade C");
			else if(result >= 40 )
				System.out.println("Grade D");
			else
				System.out.println("FAIL");
			System.out.println("------------------------------");
		}
	}
}
