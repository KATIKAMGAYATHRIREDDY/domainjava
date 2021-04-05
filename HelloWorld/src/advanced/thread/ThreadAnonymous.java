package advanced.thread;

public class ThreadAnonymous  {
/*public static void main(String[] args) {
	Thread t1=new Thread();
		public void run() {
		System.out.println("thread is running");	
		
	}
		t1.start();
}*/
public void finalize()
{
	System.out.println("object is garbage collected");
	}  
public static void main(String args[]){  
 ThreadAnonymous s1=new ThreadAnonymous();  
 ThreadAnonymous s2=new ThreadAnonymous();  
 s1=null;  
 s2=null;  
 System.gc();  
}  
}
