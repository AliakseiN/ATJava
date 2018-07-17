package StarPackage;

public class Mars extends Planets {

	String mars = "Mars";
	String masrSize;

	public String getMars() {
		return this.mars;
	}

	public void printALLinfo() {

		System.out.println(getSolarSystem() +getPlanet() + getMars());

	}

	// Другой - систему сеттеров и геттеров и инициализироваться при помощи их.

	public void setMarsSize() {
		super.setSmallPlanets(masrSize);
	}

	public String getMarsSize() {

		return this.masrSize = super.getSmallPlanets();

	}

}

