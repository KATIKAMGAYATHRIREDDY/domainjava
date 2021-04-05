package advanced.thread;

public class TestingThreads extends Thread {
public static void main(String[] args) {
	JoinDemo t1=new JoinDemo("one");
	JoinDemo t2=new JoinDemo("two");
	JoinDemo t3=new JoinDemo("three");
	t1.start();
	try {
		t1.join();
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	t2.start();
	t3.start();
	/*DownloadThread downloadThread=new DownloadThread();
	downloadThread.start();
	DbThread dbThread=new DbThread();
	Thread thread=new Thread(dbThread);
	thread.start();
	PrintNosThread pNosThread = new PrintNosThread();
	pNosThread.start();*/
}
}
