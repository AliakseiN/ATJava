
public class Label implements Comparable <Label>{

	
	String nameLabel;
	
	public Label (String nameLabel) {
		this.nameLabel =nameLabel;
	}

	 @Override
	    public int compareTo(Label nameLabel1) {
		 
	        int result = this.nameLabel.compareTo(nameLabel1.nameLabel);
	        if (result != 0) {
	            return result;
	        }
	        return 0;
	    }

	    @Override
	    public String toString() {
	        return "Label{" +  "name='" + nameLabel + '\'' +'}';
	    }
	    
}
