import java.util.Scanner;

public class readFromConsole extends Taks8MianClass {

	String variantChoose;
	int k;

	Scanner scanner = new Scanner(System.in);

	public readFromConsole() {

		System.out.print("Выберите вариат: 1.Строка 2.Предложение 3.Абзац ");

		variantChoose = scanner.nextLine();
	
		System.out.print("Введите n- ю букву каждого слова, которую нужно заменить символом “%”.");

		this.k = scanner.nextInt();// проверяет, было ли введено число int
	
		String tempVariable;

		String[] text = this.variantChoose.split(" "); /* "Разделяет строку на слова") */ {

			for (int l = 0; l < text.length; l++) /* определяем длинну массива */ {

				if (this.k < text[l].length()) /* проверяем если введённое число больше чем длинна */ {

					tempVariable = "";
					tempVariable += text[l].substring(0, k - 1);
					tempVariable += '%';
					tempVariable += text[l].substring(k, text[l].length());
					text[l] = tempVariable;
				}

				System.out.print(" " + text[l]);

			}

		}

	}
}
