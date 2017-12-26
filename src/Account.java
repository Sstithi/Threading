//file
public class Account {
private int balance ;
public Account(int balance)
{
	this .balance = balance;
}
public boolean isSufficientBalance (int w)
{
	if (balance>w)
	{
		return true;
	}
	else 
	{
		return false;
	}
}
public void withdraw(int amt)
{
	balance = balance-amt;
	System.out.println("Withdrawal money is " + amt);
	System.out.println("Now balance is " +balance);
	
}

}
