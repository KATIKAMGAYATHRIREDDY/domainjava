package advanced.thread;

public class JoinDemo extends Thread {

public JoinDemo(String string) {
	super(string);
}
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<5;i++) {
		try {
		System.out.println(i+"--"+Thread.currentThread().getName());
		Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
