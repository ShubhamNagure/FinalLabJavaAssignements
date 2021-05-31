package MCApackage.MCA;
//package MCMpackage.MCM;
import java.io.*;
class Program7
{
	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Number Of Student In First Year : ");
		int a=Integer.parseInt(br.readLine());

		System.out.print("Number Of Student In Second Year : ");
		int b=Integer.parseInt(br.readLine());

		MCA obj = new MCA();
		obj.deptMCA(a,b);

		System.out.print("Number Of Student In First Year : ");
		int x=Integer.parseInt(br.readLine());

		System.out.print("Number Of Student In Second Year : ");
		int y=Integer.parseInt(br.readLine());

		MCM obj = new MCM();
		obj.deptMCM(x,y);
	}
}