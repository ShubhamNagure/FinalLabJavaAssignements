class ThreadDemo2 extends Thread{
	
	public void run() {
		
		try {
			System.out.println("Thread ID : " + Thread.currentThread().getId());
		
			int n = 3;
			while(n<=1000) {
				int sum = 1;
				int n2 = (int) Math.ceil(n/2);
				for(int i=2; i<=n2; i++) {
					if(n%i == 0) {
						sum += i;
					}
				}
				if(sum == n) {
					System.out.println(n);
					Thread.sleep(5000);
				}
				n++;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Program14
 {
	public static void main(String args[]) {
		new ThreadDemo2().start();
	}
}
