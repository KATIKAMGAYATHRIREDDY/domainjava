package basics.interfaces;

public class GEAppliances implements ISwitchBoard {
	public void switchOne()
	{
		System.out.println("GE Light is on");
	}
	
	public void switchTwo()
	{
		System.out.println("GE Fan is on");
	}
	
	public void switchThree()
	{
		System.out.println("GE AC is on");
	}
}
