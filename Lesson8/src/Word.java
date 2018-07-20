
public class Word extends AbstarctClass {

	
	String word = "Слово";
	
	
	//абстрактный метоп переопределён и в методе используется переменная из абстрактного класса
	@Override
	public String implemetnFromAbstractClass() {
		
		return word + fromAbstract;
		
	}
	
	

}
