import java.util.Arrays;
import java.util.List;

public class Task4 {
	
	public static final String HI_THERE = "Hi there, %s." ; //create final variable

	public static void main(String[] args) {
		
		// в тексте после каждого k символа вставить заданную строку
		
		String [] textToAdd = {"Alex" , "Vita", "Igor"};
		
		Arrays.asList(textToAdd).stream().forEach(text->System.out.println(String.format(HI_THERE, text)));
		
		
	}

}
