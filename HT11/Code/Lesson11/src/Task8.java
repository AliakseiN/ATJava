import java.util.Arrays;
import java.io.*;

public class Task8 {

	public static void main(String[] args) {
		
		String text = "Hello s, *if you are reading this then* you did a great job";

		StringBuffer resultStr = new StringBuffer(text);

		resultStr.delete(text.indexOf('*'), text.lastIndexOf('*')+1);

		System.out.println(resultStr);

	}

}
