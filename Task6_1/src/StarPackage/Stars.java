package StarPackage;

public class Stars extends StarSystem {

	private String star = "Star name";
	
	

	// 3. Звезда - возвращает имя звезды, радиус, яркость свечения	

	public void starNameRadiusBrightness(String starName, String radius, String brightness) {

		System.out.println(starName + radius + brightness);

	}
	
	
//	4.	Каждый из классов-наследников нижнего уровня должен иметь метод, 
//	возвращающий строку, в которой будет имя звездной системы 
//	+ имя самого наследника (Пример: “Солнечная, система, Земля “)

	public String getStarName () {
		return this.star;
	}
	
	
	public void printSolarSystemStar( ) {
		
		System.out.println(getSolarSystem() + getStarName());
	}
	
	
	}
