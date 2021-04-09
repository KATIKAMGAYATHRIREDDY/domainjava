package lamdaExpressions.collections;


public class Employee {
	String name;
	int eid;
	public Employee(String string, int i) {
		name=string;
		eid=i;
	}
	public String toString() {
		return eid+"-"+name;
	}
	

}
