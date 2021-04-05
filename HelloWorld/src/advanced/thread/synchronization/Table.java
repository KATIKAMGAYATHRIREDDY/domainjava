package advanced.thread.synchronization;

public class Table {
	public  void printTable(int n){//method not synchronized  
		System.out.println("name of the thread is:"+Thread.currentThread().getName());   
		synchronized (this) {
			
		
		for(int i=1;i<=6;i++){  
		       
		     try{  
		    	 System.out.println(n*i);
		      Thread.sleep(300);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		   }
		 }  
}
