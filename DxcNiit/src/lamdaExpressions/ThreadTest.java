package lamdaExpressions;
public class ThreadTest {
public static void main(String[] args) {
	/*MyRunnable r = new MyRunnable();
	Thread t = new Thread(r);
	t.start();*/
	Runnable r= ()->{
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	};
	Thread t= new Thread(r);
	t.start();
	for(int i=0;i<5;i++)
	{
		System.out.println("i am in main thread");
	}
}
}
