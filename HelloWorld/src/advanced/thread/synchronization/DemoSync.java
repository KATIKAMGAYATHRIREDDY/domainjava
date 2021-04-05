package advanced.thread.synchronization;

public class DemoSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table table=new Table();
MyThread1 myThread1=new MyThread1(table,"myt1");
MyThread2 myThread2=new MyThread2(table,"myt2");
myThread1.start();
myThread2.start();
	}

}
