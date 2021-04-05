package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomeTax incomeTax = new IncomeTax();
		System.out.println("your tax is="+incomeTax.calculateTax(1200000));
		Gst gst=new Gst();
		System.out.println("your tax is="+gst.calculateTax(1200000));
	}

}
