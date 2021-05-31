import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Program25 
{
public static void main(String[] args) throws IOException 
{
		FileReader fr = new FileReader("F:/MCA1Sem1/JavaPractical/myinfo.txt");
		String txt = "";
		int i;
		while((i=fr.read())!=-1) {
			txt = txt + (char)i;
		}
		String words[] = txt.split(" ");
		
		String word = "is";
		
		int count = 0;
	    for (int j = 0; j < words.length; j++)
	    {
		    if (word.equals(words[j]))
		        count++;
	    }
	    System.out.println(word + " found count : " + count);
		fr.close();
	}

}
