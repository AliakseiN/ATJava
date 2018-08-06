
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task5 {

	public static final String HI_THERE = "Hi there, %s."; // create final variable

	public static void main(String[] args) {

		String[] textToAdd = { "Alex", "Vita", "Igor" };
		String word = "How do you do?";

		// После каждого слова текста, зхаканчивающегося заданной подстрокой, вставить
		// указанное слово
		

		Arrays.asList(textToAdd).stream()
				.filter(text -> (text.endsWith("ex") || text.endsWith("ta") || text.endsWith("or")))
				.collect(Collectors.toList())
				.forEach(text -> System.out.println(String.format(HI_THERE, text.concat(". " + word))));

	}

}
