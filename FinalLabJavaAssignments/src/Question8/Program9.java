import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program9 
{
public static void main(String[] args) throws IOException 
{
		FileReader fr = new FileReader("F:/MCA1Sem1/JavaPractical/myinfo.txt");
		int i;
		char ch;
		int chCnt=0, wdCnt=0, lnCnt=0;
		while((i=fr.read())!=-1) {
			ch = (char)i;
			if(ch == ' ') {
				wdCnt++;
			}
			else if(ch == '\n') {
				lnCnt++;
				wdCnt++;
			}
			else {
				chCnt++;}
		}
		System.out.println("Character Count : " + chCnt + "\nWord Count : " + wdCnt + "\nLine Count : " + (lnCnt+1));
	}
}