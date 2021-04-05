package advanced.thread.synchronization;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		new Thread()
		{
			public void run(){
				bank.withDraw(15000);
			}
		}.start();
		new Thread() {
			public void run(){
				bank.deposit(10000);
			}
		}.start();
	}

}
