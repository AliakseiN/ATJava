package StarPackage;

public class Sun extends Stars {

	private String starSun = "Sun";
	private String radiusSun = "695508";
	private String brightnessSun ="2,009·107 Вт/м²/ср";
		
	
		 
	// 3. Звезда - возвращает имя звезды, радиус, яркость свечения
	 
	 public void printStarNameRadiusBrightness () {
		 
		 System.out.println("Star name is " + starSun + ", " + "Radius is "+ radiusSun + ", " + "Brightness is " + brightnessSun );
		  			 }
	 
	 
	 
	 public String getStarSun () {
		 
		 return this.starSun;
	 }
	 
	 
	 
	 public void printAllinfoStarSun () {
			
			System.out.println(getSolarSystem()+ super.getStarName() +getStarSun() );
			
		}
	 
	// Третий - перегруженные, но не связанные друг с другом конструкторы и 
	 //создаваться при помощи одного из них на выбор.
	 
	 
	 
	 
	 
}
