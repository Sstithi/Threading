
public class ThreadTest {
public static void main(String[] args) {
	Account  acc = new Account (1000);
	Customer c1 = new Customer("Showmita",acc),c2= new Customer ("Furkan",acc);
	Thread t1= new Thread(c1),t2 = new Thread(c2);
	t1.start();
	t2.start();
}
}
