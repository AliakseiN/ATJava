
public class Task18 {

	public static void main(String[] args) {
		
	
		char[] c = { 'a', 'e', 'i', 'o', 'u', 'y' };
				String str = "Hello %s, if you are reading this then you did a great job54552.";
				String str1 = str.toLowerCase();
				String str2 = str1.replaceAll("\\s|!", "");
				int count = 0;		
				char[] chStr = str2.toCharArray();
					for (int i = 0; i < chStr.length; i++) {
					for (int j = 0; j < c.length; j++) {
						if (chStr[i] == c[j]) {
							count++;
						break;
						}

					}

				}
				System.out.println("Согласные : " + count);
	}

}
