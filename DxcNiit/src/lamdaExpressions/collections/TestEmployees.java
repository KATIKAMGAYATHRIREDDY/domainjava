package lamdaExpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("ram",1234));
		employees.add(new Employee("ramu",5234));
		employees.add(new Employee("ravi",234));
		employees.add(new Employee("raju",9234));
		employees.add(new Employee("gayathri",134));
		System.out.println(employees);
		Comparator<Employee> c = (e1,e2)-> (e1.eid < e2.eid)? -1:(e1.eid>e2.eid)?1:0;
		Collections.sort(employees,c);
		System.out.println(employees);
	}

}
