import java.util.*;
import java.io.*;
class Program12
{
    public static void main(String args[])
    {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Array List In Java");
            arrlist.add(i);
            System.out.println(arrlist);
            //arrlist(3);
            //System.out.println(arrlist);

            System.out.println("+++++++++++++++++++++++++++++");

            System.out.println("Linked List In Java");
            
            LinkedList<String> ll = new LinkedList<String>();
            ll.add("A");
            ll.add("B");
            ll.add("C");
            System.out.println(ll);
            ll.remove("B");
            ll.removeFirst();
            System.out.println("Linked List After Deletion : "+ll);
        }
    }
}