import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class Task6 {

	public static void main(String[] args) {

		// В зависимости от признака (0 или 1) в каждой строке текста удалить указанный
		// символ везде, где он встречается, или вставить его после K-го символа.
		String a = "a";// 0
		String b = "b";// 1
		String text = "Hello %s, if you are reading this then you did a great job";
		Scanner scan = new Scanner(System.in);
		System.out.println("Для удаления символа 'а' введите 0. Для удаления символа 'b'  введите 1.");


		while (!scan.hasNextInt()) {

			scan.next();
			System.out.println("Введите число 0 или 1");

		}
		int inputScanner = scan.nextInt();
		
		if (inputScanner == 0) {

			Arrays.asList(text).stream().forEach(textNew -> System.out.println("You've delete character 'a' from text " +"\"" +text.replace(a, "") + "\""));

		} 
		 else if (inputScanner == 1) {

			Arrays.asList(text).stream().forEach(textNew -> System.out.println("You've delete character 'b' from text " +"\"" +text.replace(b, "") + "\""));

		}
		
		}

	}

