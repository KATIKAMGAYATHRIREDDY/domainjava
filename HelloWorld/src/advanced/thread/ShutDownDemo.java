package advanced.thread;

public class ShutDownDemo extends Thread {
public static void main(String[] args) {
	Runtime runtime=Runtime.getRuntime();
	runtime.addShutdownHook(new WatchMan());
	System.out.println("now main sleeping...press Ctrl+c to exit");
	try {
		Thread.sleep(3000);
	}catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	
	
}
}
class WatchMan extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("watch man is shuting down all appliance");
	}
}