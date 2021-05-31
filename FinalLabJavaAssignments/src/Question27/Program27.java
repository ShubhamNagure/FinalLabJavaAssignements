class ThreadDemo1 extends Thread
{
	public void run() 
    {
		
		try
         {
			System.out.println("Thread ID : " + Thread.currentThread().getId());
			int n = 5;
			
			while(n<=500)
             {
				boolean f = false;
				for(int i=2; i<n; i++)
                 {
					if(n%i == 0) 
                    {
						f=true;
						break;
					}
				}
				if(!f)
                 {
					System.out.println(n);
					Thread.sleep(3000);
				}
				n++;				
			}
		
		}
        catch(Exception e)
        {
			System.out.println(e);
		}
	}
}
public class Program27
{

	public static void main(String args[]) 
	{
		new ThreadDemo1().start();
	}
}
