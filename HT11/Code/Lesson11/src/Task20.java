
public abstract class Task20 {

	public static void main(String[] args) {
		
		String str = "Hello %s, if you are reading this then you did a great job54552.";
		char[] c = { '.', ',', '-', ':', ';', '?', '!' };
		int count = 0;

		char[] character = str.toCharArray();
		for (int i = 0; i < character.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (character[i] == c[j]) {
					count++;
				}
			}
		}
		System.out.println("Знаков препинания : " + count);

	}

}
