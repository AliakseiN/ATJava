import java.util.Scanner;

public class readFromConsole extends Taks8MianClass {

	String inputText;
	int letterToBeChanged;

	Scanner scanner = new Scanner(System.in);
	public readFromConsole() {

		System.out.print("Введите что-нибудь ");

		inputText = scanner.nextLine();
	
		System.out.print("Введите n- ю букву каждого слова, которую нужно заменить символом “%”.");

		this.letterToBeChanged = scanner.nextInt();// проверяет, было ли введено число int
	
		String tempVariable;

		String[] text = this.inputText.split(" "); /* "Разделяет строку на слова") */ {

			for (int l = 0; l < text.length; l++) /* определяем длинну массива */ {

				if (this.letterToBeChanged < text[l].length()) /* проверяем если введённое число больше чем длинна */ {

					tempVariable = "";
					tempVariable += text[l].substring(0, letterToBeChanged - 1);
					tempVariable += '%';
					tempVariable += text[l].substring(letterToBeChanged, text[l].length());
					text[l] = tempVariable;
				}

				System.out.print(" " + text[l]);

			}

		}

	}
}
