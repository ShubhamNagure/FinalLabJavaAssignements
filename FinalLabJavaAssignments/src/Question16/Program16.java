class Thread1 extends Thread{
	
	public synchronized void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i*5);
		}
	}
}

class Thread2 extends Thread{
	public synchronized void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i*100);
		}
	}
}

public class Program16 {	
	public static void main(String args[]) {
		new Thread1().run();
		new Thread2().run();
		
	}
}

