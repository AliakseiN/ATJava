package StarPackage;

public class Earth extends Planets {

	
	String earth ="Earth";
	
	public String getEarth () {
	return this.earth;
 } 
	
	

	
	
	
	public void printALLinfo ( ) {
		
		System.out.println(getSolarSystem() + getPlanet()+  getEarth());
		
	}
	
	
	//Один из классов на выбор должен содержать перегруженные связанные
	//друг с другом конструкторы и создаваться с их помощью.
	
	Planets planet = new  Planets();

	public Earth () {
		
	}
	
	public Earth (String planet, String earth) {
		
		}
	
	
}