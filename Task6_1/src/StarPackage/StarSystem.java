package StarPackage;

public class StarSystem {

	
	
	public String solarSystem = "Solar system";
	
	
	//1.	Звездная система - возвращает количество звезд в ней
	
		void numberOfStars (int...starsNumber) {
			
			for ( int i =0; i < starsNumber.length; i++ ) {
				
				System.out.println(starsNumber[i]); // выводит количество звезд в ней
			
				
			}
			
		}
		
		
////	4.	Каждый из классов-наследников нижнего уровня должен иметь метод, 
//	возвращающий строку, в которой будет имя звездной системы + имя самого наследника 
//	(Пример: “Солнечная, система, Земля “)

		
		/*public String printSolarSystem() {
			System.out.println(solarSystem);
			return this.solarSystem;

		}*/
		
		public String getSolarSystem() {
			return solarSystem;

		}
//		

	
		
}
