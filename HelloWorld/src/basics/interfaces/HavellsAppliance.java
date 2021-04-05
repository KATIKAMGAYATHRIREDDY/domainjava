package basics.interfaces;

public class HavellsAppliance implements ISwitchBoard{
	public void switchOne()
	{
		System.out.println("Light is on");
	}
	
	public void switchTwo()
	{
		System.out.println("Fan is on");
	}
	
	public void switchThree()
	{
		System.out.println("AC is on");
	}
}
