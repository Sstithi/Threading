package Next;
/* Generally it is useful to use runnable interface while using thread, As if we extends 
 thread class then our parent class will be only and only the Thread class. If we use runnable interface than we can 
 use another parent class if we need to implement any other parent class if needed
 */

//file

public class A__B {
	public static void main(String[] args) {
		A a = new A ();
		B b = new B ();
		a.start();
		b.start();
		
		
	} 

}
