class InsufficientFundException extends Exception{
	
	InsufficientFundException(String s){
		super(s);
	}
	
}

class Account{
	
	float balance;
	public Account() {
		balance = 5000f;
	}
	
	public void withdraw(float amt) {
		try {
			if(amt > balance)
				throw new InsufficientFundException("Insufficient Funds : Available Fund : " + balance);
			System.out.println("Fund Withdrawed : " + amt);
		}catch(InsufficientFundException e) {
			System.out.println("Exception : " + e);
		}
	}
}

public class Program10 
{

	public static void main(String a[]) 
    {
		
		float amt = Float.parseFloat(a[0]);
		Account acc = new Account();
		acc.withdraw(amt);
	}
}
