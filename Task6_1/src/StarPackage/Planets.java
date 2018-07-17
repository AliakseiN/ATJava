package StarPackage;

public class Planets extends StarSystem {

	private String planet = "Planet";
	private String  giantPlanets = "Giant planet"; 
	private String  smallPlanets = "Small planet"; 
	
	
	
	
	Earth earth = new Earth();
	Mars mars = new Mars();
	Sun sun = new Sun();
	Sirius sirius = new Sirius();

	// 2. Планета - имя звезды, вокруг которой она вращается + имя планеты
	public void starNamePlanetName(String starName, String planetName) {

		System.out.println(earth.getEarth() + "rotares around the" + sun.getStarSun());
		System.out.println(mars.getMars() + "rotares around the" + sirius.getStaNameSirius());

	}
	
	
	// конструктор
	public Planets() {
	} 
	
	public Planets (String giantPlanets) {
		//getGiantPlanets();
		
		}
	
	public Planets (String giantPlanets,String smallPlanets) {
		//getGiantPlanets();
		
		}
	
	
	
	public String getPlanet() {
		
		
		return this.planet;
	
	
	}

	public void printSolarSystemPlanet() {

		System.out.println(getSolarSystem() + getPlanet());
		
	}

	
	public void setSmallPlanets (String setSmallPlanets) {
		this.smallPlanets =setSmallPlanets;
	}
	

	public String getSmallPlanets () {
		return this.smallPlanets;
	}
	
	
	
	
	public String getGiantPlanets () {
		return this.giantPlanets;
	}
	
	
}
