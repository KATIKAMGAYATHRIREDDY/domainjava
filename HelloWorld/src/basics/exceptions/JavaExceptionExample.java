package basics.exceptions;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;  
			System.out.println(s.length());
		int data=100/0;
		System.out.println("got fever tablet");
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("got another tablet");
		}catch(Exception e) {
			System.out.println("2nd catch");
			
		}
		
		System.out.println("code");
	
	}
}
