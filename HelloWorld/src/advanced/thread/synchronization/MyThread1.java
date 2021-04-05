package advanced.thread.synchronization;

public class MyThread1 extends Thread {
	Table table;  
	public MyThread1(Table table,String name){  
	super(name);
		this.table=table;  
	}  
	public void run(){  
	table.printTable(5); 
	
	}  
}
