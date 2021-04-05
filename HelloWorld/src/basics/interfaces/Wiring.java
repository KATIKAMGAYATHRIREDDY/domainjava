package basics.interfaces;

public class Wiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISwitchBoard switchboard;
		switchboard=new HavellsAppliance();
		switchboard.switchOne();
		switchboard.switchTwo();
		switchboard.switchThree();
		switchboard=new GEAppliances();
		switchboard.switchOne();
		switchboard.switchTwo();
		switchboard.switchThree();
		
	}

}
