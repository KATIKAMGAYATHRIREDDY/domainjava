package advanced.thread.synchronization;

public class Bank {
	int bankBalance=10000;
	synchronized void withDraw(int amountWithdrawn) {
		
		System.out.println("going to withdraw...");  
		if(bankBalance < amountWithdrawn) {
			//ask him to wait as less balance
			System.out.println("Less balance; waiting for deposit...");  

			try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		else {
			//allow him  to withdraw
		}
	}
	synchronized void deposit(int amountDeposited) {
		System.out.println("going to deposit...");  
		bankBalance+=amountDeposited;
		System.out.println("deposit completed... ");
	}
}
