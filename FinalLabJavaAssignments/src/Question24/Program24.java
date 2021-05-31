import java.io.*;
 
public class Program24
{  
    public static void main(String args[]) throws IOException
    {
         File fileName = new File("F:/MCA1Sem1/JavaPractical/file1.txt"); 
         File filename = new File("F:/MCA1Sem1/JavaPractical/file2.txt");
        FileInputStream inFile = new FileInputStream("F:/MCA1Sem1/JavaPractical/myinfo.txt");
        FileInputStream inFile = new FileInputStream("F:/MCA1Sem1/JavaPractical/index.txt");
        int fileLength =(int)fileName.length();
        int fileLength =(int)fileName.length();

             
        byte Bytes[]=new byte[fileLength];
        byte Bytes[]=new byte[fileLength];
             
        System.out.println("File size is: " + inFile.read(Bytes));
        System.out.println("File size is: " + inFile.read(Bytes));

             
        String file1 = new String(Bytes);
        String file2 = new String(Bytes); 
        System.out.println("File content is:\n" + file1);
         System.out.println("File content is:\n" + file2);
     
        FileOutputStream outFile = new FileOutputStream("F:/MCA1Sem1/JavaPractical/sample-copy.txt");
         FileOutputStream outFile = new FileOutputStream("F:/MCA1Sem1/JavaPractical/index-copy.txt");

     
        for (int i = 0; i<fileLength; i++)
        {
            outFile.write(Bytes[i]);
        }       
             
        System.out.println("File copied.");
        //close files
        inFile.close();
        outFile.close();
    }
}

