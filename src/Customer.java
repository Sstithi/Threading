//file
import java.util.Scanner;

public class Customer implements Runnable{
	private Account account;
	private String name;
	public Customer (String n,Account account)
	{
		this.name = n;	
		this.account = account;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		synchronized (account) {
		System.out.println(name + "\n Enter amount to withdraw:");
		int amt = sc.nextInt();
	
			
		
		if  (account.isSufficientBalance(amt))
		{
			System.out.println(name);
			account.withdraw(amt);
			
		}
		else 
		{
			System.out.println(name);
			System.out.println("Insufficient Balance");
		}
		}
		
	}
	

}
