package lamdaExpressions.defaultstatic;

public class FirstImpl implements SomeInterface {
	public void method1() {
		System.out.println("method1 in firstimpl");
	}

	@Override
	public void method2() {
		System.out.println("method2 in firstimpl");

	}
	
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		//SomeInterface.super.method3();
		System.out.println("overridden firstimpl of method3 ");
	}
	
	 void add() {}
}