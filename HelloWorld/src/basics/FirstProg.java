package basics;
/**
 * this is my first class
 * @author katik
 *
 */
public class FirstProg {
	public static void main(String[] args) {
Student obj=new Student();//by new memory is allocated to object obj
Student myStudent = new Student("reddy",22);
System.out.println("name is "+myStudent.name +" age is "+myStudent.age);
Student myStudent1 = new Student("gayathri",22,100,true);
System.out.println("name is "+myStudent1.name +" age is "+myStudent1.age+" marks is "+myStudent1.marks+" elgibility is "+myStudent1.isElgible);
obj.setName("gayathri");
//obj.name="gayathri";
obj.age=20;
obj.marks=100;
obj.isElgible=true;
//System.out.println(obj.name);
System.out.println(obj.getName());
		//printDigit();		
	
		//printNos();
	}

	/*private static void printDigit() {
		int number=20;
		switch (number)
		{
		case 10:
			System.out.println("ten");
			break;
		case 20:
			System.out.println("twenty");
			break;
		case 30:
			System.out.println("thirty");
			break;
		}
	}
	/**
	 * this method prints ten numbers
	 */
	/*private static void printNos() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		
		}
		
	}*/
}
