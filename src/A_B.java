//file
class A implements Runnable
{
	public void run ()
	{
		for (int i =0;i<=10;i++)
		{
			System.out.println("Thread A " + i);
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for (int i =0;i<10 ;i++)
		{
			System.out.println("Thread B " + i);
		}
	}
}
public class A_B {
public static void main(String[] args) {
	A a = new A ();
	
	Thread t1 = new Thread(a);
	Thread t2 = new Thread(new B());
	t1.start();
	t2.start();
}
}