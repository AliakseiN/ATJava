
public class Paragraph implements getSetInterface {

	private String paragraphString = "Private pragrapgh";
	protected String inftoText = "Protected text";
	String text = "Simple friendky text";
	public String publicText = "Public text" ;
		
	
	
	@Override
	public String getParapraph() {
		System.out.println(paragraphString);
		return paragraphString;
	}

	@Override
	public String getInfo() {
		System.out.println(inftoText);
		return inftoText;
	}

	
	
	
	private String getInfoOnlyInPackage() {
		System.out.println(paragraphString);
		return paragraphString;
		
	}
	
	protected void infoOnlyInClass () {
		this.inftoText = inftoText;
	}
	
	
	
	public String getInfoFromAnyWhere () {
		System.out.println(publicText);
		return publicText;
	}
	
	
	
	
}
