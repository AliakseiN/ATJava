import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
//		private ArrayList<Button> button;
//		private LinkedList<Field> field;
//		private HashSet<Label> label;
//		private TreeSet<DropDown> dropdown;
//		private float id;
//		private String title;
//		
		
	
		Button adButton = new Button ("Sing In", "Push");
		Field addField = new Field (1,"First field");
		Label adLabel = new Label ("Good label");
		
		  List<String> options = new ArrayList();
		  options.add("First option");
		DropDown addDropDownl = new DropDown(options, true, "Please select from ");
		
		
	
		
		ArrayList<Button> button = new ArrayList<Button> ();
	
		button.add(adButton);
		
		LinkedList<Field> field = new LinkedList<Field>();
		
		field.add(addField);
		
		HashSet<Label> label = new  HashSet<Label>();
		label.add(adLabel);
		
		TreeSet<DropDown> dropdown = new TreeSet<DropDown> ();
		dropdown.add(addDropDownl);
		
		
		Page page = new Page(button, field, label,dropdown,1, "Best tittle");
		
	
		page.buttonExistence();
		
	}

}
