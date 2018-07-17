package StarPackage;

public class Sirius extends Stars {

	private String staNameSirius = "Sirius";
	private String radiusSirius = "695508";
	private String brightnessSirius ="2,009·107 Вт/м²/ср";
		
	
	
	
	
	public void printStarNameRadiusBrightness () {
		 
		 System.out.println("Star name is " + staNameSirius +", " + "Radius is "+ radiusSirius + "," + "Brightness is " + brightnessSirius );
		 
		
	 }
	
	public String getStaNameSirius () {
		return this.staNameSirius;
	}
	
	public void printAllinfoStarSirius () {
		
		System.out.println(getSolarSystem() + getStarName() + getStaNameSirius() );
		
	}
	
	
}
