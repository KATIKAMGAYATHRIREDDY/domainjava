package advanced.thread.synchronization;

public class MyThread2 extends Thread {

Table table;  
public MyThread2(Table table,String name){  
super(name);
	this.table=table;  
}  
public void run(){  
table.printTable(100);

}  
}
