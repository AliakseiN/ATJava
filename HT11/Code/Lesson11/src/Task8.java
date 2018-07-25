import java.util.Arrays;
import java.io.*;

public class Task8 {

	public static void main(String[] args) {
		// Удалить из теста его часть заключенную между двумя символами которые вводятся
		// например между между звёздочками "*"

		String text = "Hello s, *if you are reading this then* you did a great job";

		StringBuffer resultStr = new StringBuffer(text);

		resultStr.delete(text.indexOf('*'), text.lastIndexOf('*'));

		System.out.println(resultStr);

	}

}
