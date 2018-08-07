import java.util.*;

public class DropDown implements Comparable <DropDown> {
	
	
	List <String> options;
	boolean isSelected;
	String nameDropDown;
	
	TreeSet<DropDown> dropdowns;
	
	public DropDown (List <String> options, boolean isSelected,String nameDropDown ) {
		
		this.options = options;
		this.isSelected =isSelected;
		this.nameDropDown = nameDropDown;
	}

	@Override
	
	public int compareTo(DropDown o) {
		
		return nameDropDown.compareTo(o.nameDropDown);
		
	}

}
