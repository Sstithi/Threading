//file
package Next;

public class A extends Thread
{
	public void run ()
	{
		for(int i =0;i<=10;i++)
		{
			System.out.println("Thread A " + i);
		}
	}
}