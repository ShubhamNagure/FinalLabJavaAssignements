import java.util.*;
class Program13
{
	String name;
	int rollno;
	String cls;
	int[] marks;
	float percentage;

	public Program13(String n,int r,String c,int[] m)
	{
		name=n;
		rollno=r;
		cls=c;
		marks=m;
	}
	public void per()
	{
		percentage=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
		System.out.println("Percentage "+percentage);
	}
	static void display(Student[] s)
	{
		Arrays.sort(s);
		System.out.println("Students data stored in assending order : ");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].name+" "+s[i].percentage);
		}
	}
	

public static void main(String args[])
{

	Student[] s = new Student[5];
	s[0]=new Student("Shubham",1,"MCA1",new int[]{45,56,89,49,50,50});
	s[1]=new Student("Amit",2,"MCA1",new int[]{46,89,56,47,68,98});
	s[0].per();
	s[1].per();
   
   

}}